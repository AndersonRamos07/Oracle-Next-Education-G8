package com.example.literalura.dto.gutendex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GutendexBookDTO(
        String title,
        List<GutendexAuthorDTO> authors,
        List<String> languages,
        Integer download_count
) {}
