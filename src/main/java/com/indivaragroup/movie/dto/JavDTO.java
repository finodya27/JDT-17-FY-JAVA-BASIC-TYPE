package com.indivaragroup.movie.dto;

import java.time.LocalDate;

public class JavDTO {

    private String releaseCode;
    private LocalDate releaseDate;

    // CONSTRUCTOR
    public JavDTO(String releaseCode, LocalDate releaseDate) {
        this.releaseCode = releaseCode;
        this.releaseDate = releaseDate;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}