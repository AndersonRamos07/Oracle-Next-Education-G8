package com.example.literalura.dto.gutendex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GutendexAuthorDTO(
        String name,
        Integer birth_year,
        Integer death_year
) {}
