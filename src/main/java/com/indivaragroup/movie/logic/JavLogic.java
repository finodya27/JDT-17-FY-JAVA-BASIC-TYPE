package com.indivaragroup.movie.logic;

import com.indivaragroup.movie.dto.JavDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class JavLogic {

    public void execute() {

        ArrayList<JavDTO> movieList = new ArrayList<>();
        ArrayList<JavDTO> notUpdatedList = new ArrayList<>();

        // ADD DATA
        movieList.add(new JavDTO("STAR-4124", LocalDate.of(2025, 5, 4)));
        movieList.add(new JavDTO("ABP-999", LocalDate.of(2026, 1, 10)));
        movieList.add(new JavDTO("MIDE-777", LocalDate.of(2024, 8, 12)));
        movieList.add(new JavDTO("SSIS-101", LocalDate.of(2023, 3, 22)));
        movieList.add(new JavDTO("IPZZ-455", LocalDate.of(2026, 7, 1)));

        // FILTER
        for (JavDTO dto : movieList) {

            if (dto.getReleaseDate().getYear() < 2026) {
                notUpdatedList.add(dto);
            }
        }

        // PRINT RESULT
        System.out.println("LIST FILM UDAH GAK UPDATE");

        for (JavDTO dto : notUpdatedList) {

            System.out.println("Code : " + dto.getReleaseCode());
            System.out.println("Release Date : " + dto.getReleaseDate());
            System.out.println("----------------------");
        }
    }
}