package com.example.literalura.service;

import com.example.literalura.dto.gutendex.GutendexResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GutendexClient {

    private final WebClient webClient;

    public GutendexClient() {
        this.webClient = WebClient.builder()
                .baseUrl("https://gutendex.com")
                .build();
    }

    public GutendexResponseDTO searchBooks(String query) {
        return webClient.get()
                .uri(uri -> uri.path("/books")
                        .queryParam("search", query)
                        .build())
                .retrieve()
                .bodyToMono(GutendexResponseDTO.class)
                .block();
    }
}
