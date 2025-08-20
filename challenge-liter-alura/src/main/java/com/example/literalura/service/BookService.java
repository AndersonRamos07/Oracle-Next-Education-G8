package com.example.literalura.service;

import com.example.literalura.domain.Author;
import com.example.literalura.domain.Book;
import com.example.literalura.domain.Language;
import com.example.literalura.dto.gutendex.GutendexBookDTO;
import com.example.literalura.dto.gutendex.GutendexResponseDTO;
import com.example.literalura.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository books;
    private final AuthorService authorService;
    private final GutendexClient gutendex;

    public BookService(BookRepository books, AuthorService authorService, GutendexClient gutendex) {
        this.books = books;
        this.authorService = authorService;
        this.gutendex = gutendex;
    }

    public List<Book> listAll() {
        return books.findAll();
    }

    public List<Book> listByLanguage(Language language) {
        return books.findByLanguage(language);
    }

    @Transactional
    public Optional<Book> fetchFromApiAndSaveByTitle(String titleQuery) {
        GutendexResponseDTO response = gutendex.searchBooks(titleQuery);
        if (response == null || response.results() == null || response.results().isEmpty())
            return Optional.empty();

        // Escolhe o melhor match (título mais próximo + maior downloads)
        final GutendexBookDTO best = response.results().stream()
                .sorted(Comparator
                        .comparing(GutendexBookDTO::download_count, Comparator.nullsLast(Comparator.reverseOrder()))
                        .thenComparing(g -> similarityScore(titleQuery, g.title()), Comparator.reverseOrder()))
                .findFirst()
                .orElse(null);

        if (best == null) return Optional.empty();

        // Mapeia autor (primeiro autor)
        final String authorName = (best.authors() != null && !best.authors().isEmpty())
                ? best.authors().get(0).name()
                : "Autor Desconhecido";

        final Integer birth = (best.authors() != null && !best.authors().isEmpty())
                ? best.authors().get(0).birth_year()
                : null;

        final Integer death = (best.authors() != null && !best.authors().isEmpty())
                ? best.authors().get(0).death_year()
                : null;

        final Author author = authorService.upsert(authorName, birth, death);

        final Language lang;
        if (best.languages() != null && !best.languages().isEmpty()) {
            lang = Language.fromGutendex(best.languages().get(0));
        } else {
            lang = Language.OTHER;
        }

        // Upsert por título
        final Book book = books.findFirstByTitleIgnoreCase(best.title())
                .map(b -> {
                    b.setAuthor(author);
                    b.setLanguage(lang);
                    b.setDownloadCount(best.download_count());
                    return b;
                })
                .orElseGet(() -> Book.builder()
                        .title(best.title())
                        .author(author)
                        .language(lang)
                        .downloadCount(best.download_count())
                        .build());

        return Optional.of(books.save(book));
    }

    private int similarityScore(String q, String t) {
        q = q == null ? "" : q.toLowerCase();
        t = t == null ? "" : t.toLowerCase();
        if (t.equals(q)) return 100;
        if (t.contains(q)) return 80;
        if (q.contains(t)) return 60;
        return 0;
    }
}
