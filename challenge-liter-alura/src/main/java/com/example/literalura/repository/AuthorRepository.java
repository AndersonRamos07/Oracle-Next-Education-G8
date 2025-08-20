package com.example.literalura.repository;

import com.example.literalura.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByNameIgnoreCase(String name);

    // Para aliveInYear
    List<Author> findByBirthYearLessThanEqualAndDeathYearGreaterThanEqual(int birth, int death);
}
