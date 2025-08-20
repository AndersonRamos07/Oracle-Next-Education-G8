package com.example.literalura.domain;

public enum Language {
    PT, EN, ES, FR, DE, IT, OTHER;

    public static Language fromGutendex(String code) {
        if (code == null) return OTHER;
        String c = code.trim().toLowerCase();
        return switch (c) {
            case "pt" -> PT;
            case "en" -> EN;
            case "es" -> ES;
            case "fr" -> FR;
            case "de" -> DE;
            case "it" -> IT;
            default -> OTHER;
        };
    }
}
