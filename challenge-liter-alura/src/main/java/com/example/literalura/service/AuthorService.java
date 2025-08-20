package com.example.literalura.service;

import com.example.literalura.domain.Author;
import com.example.literalura.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author upsert(String name, Integer birthYear, Integer deathYear) {
        Author author = authorRepository.findByNameIgnoreCase(name)
                .stream().findFirst()
                .orElseGet(() -> Author.builder().name(name).build());

        author.setBirthYear(birthYear);
        author.setDeathYear(deathYear);

        return authorRepository.save(author);
    }

    // Lista todos os autores
    public List<Author> listAll() {
        return authorRepository.findAll();
    }

    // Retorna autores vivos em um ano específico
    public List<Author> aliveInYear(int year) {
        return authorRepository.findByBirthYearLessThanEqualAndDeathYearGreaterThanEqual(year, year);
    }
}
