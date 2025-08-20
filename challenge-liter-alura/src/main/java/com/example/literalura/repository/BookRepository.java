package com.example.literalura.repository;

import com.example.literalura.domain.Book;
import com.example.literalura.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByLanguage(Language language);
    Optional<Book> findFirstByTitleIgnoreCase(String title);
}
