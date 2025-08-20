package com.example.literalura.cli;

import com.example.literalura.domain.Author;
import com.example.literalura.domain.Book;
import com.example.literalura.domain.Language;
import com.example.literalura.service.AuthorService;
import com.example.literalura.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class MenuRunner implements CommandLineRunner {

    private final AuthorService authorService;
    private final BookService bookService;

    public MenuRunner(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu LiterAlura ===");
            System.out.println("1 - Listar autores");
            System.out.println("2 - Listar autores vivos em um ano");
            System.out.println("3 - Listar livros por idioma");
            System.out.println("4 - Buscar livro na API e salvar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    listAuthors();
                    break;
                case 2:
                    listAuthorsAliveInYear(scanner);
                    break;
                case 3:
                    listBooksByLanguage(scanner);
                    break;
                case 4:
                    searchAndSaveBook(scanner);
                    break;
                case 0:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void listAuthors() {
        List<Author> authors = authorService.listAll();
        System.out.println("\n=== Autores ===");
        authors.forEach(a -> System.out.println(a.getName()));
    }

    private void listAuthorsAliveInYear(Scanner scanner) {
        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        List<Author> authors = authorService.aliveInYear(year);
        System.out.println("\n=== Autores vivos em " + year + " ===");
        authors.forEach(a -> System.out.println(a.getName()));
    }

    private void listBooksByLanguage(Scanner scanner) {
        System.out.print("Digite o idioma (EN, PT, OTHER): ");
        String langInput = scanner.nextLine().toUpperCase();

        Language lang;
        try {
            lang = Language.valueOf(langInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Idioma inválido! Usando OTHER.");
            lang = Language.OTHER;
        }

        List<Book> books = bookService.listByLanguage(lang);
        System.out.println("\n=== Livros em " + lang + " ===");
        books.forEach(b -> System.out.println(b.getTitle() + " - " + b.getAuthor().getName()));
    }

    private void searchAndSaveBook(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();

        Optional<Book> bookOpt = bookService.fetchFromApiAndSaveByTitle(title);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            System.out.println("Livro salvo: " + book.getTitle() + " - " + book.getAuthor().getName());
        } else {
            System.out.println("Nenhum livro encontrado para o título informado.");
        }
    }
}
