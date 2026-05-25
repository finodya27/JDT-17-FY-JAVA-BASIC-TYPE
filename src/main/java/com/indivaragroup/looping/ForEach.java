package com.indivaragroup.looping;

public class ForEach {

    public void loopingForEach() {

        System.out.println("=== FOREACH LOOP ===");

        String[] cuaca = {"cerah", "hujan", "berawan", "angin"};

        for (String c : cuaca) {
            System.out.println("Cuaca hari ini: " + c);
        }
    }
}