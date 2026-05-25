package com.indivaragroup.switchcase;

public class BreakOperation {

    public void contohBreak() {

        System.out.println("=== BREAK ===");

        for (int i = 1; i <= 10; i++) {

            // berhenti saat i = 6
            if (i == 6) {
                System.out.println("Loop berhenti di angka " + i);
                break;
            }

            System.out.println("Angka: " + i);
        }
    }
}