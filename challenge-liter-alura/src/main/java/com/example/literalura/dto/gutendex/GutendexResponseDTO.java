package com.example.literalura.dto.gutendex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GutendexResponseDTO(
        Integer count,
        String next,
        String previous,
        List<GutendexBookDTO> results
) {}
