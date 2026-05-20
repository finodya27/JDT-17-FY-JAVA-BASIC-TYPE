package com.indivaragroup.house.floor.logic;

import com.indivaragroup.house.floor.dto.CeramicDTO;

import java.util.ArrayList;

public class CeramicLogic {

    public void check() {

        ArrayList<CeramicDTO> ceramicList = new ArrayList<>();

        ceramicList.add(new CeramicDTO("MARMER"));
        ceramicList.add(new CeramicDTO("BATU"));
        ceramicList.add(new CeramicDTO("GRANIT"));

        for (CeramicDTO dto : ceramicList) {

            if ("MARMER".equals(dto.getNameCeramic())) {
                System.out.println("INI BETUL MARMER -- true");
            } else {
                System.out.println("INI BUKAN MARMER -- false");
            }
        }
    }
}