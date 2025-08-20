package com.forumhub.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TopicoDTO {

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    @NotBlank
    private String curso;
}
