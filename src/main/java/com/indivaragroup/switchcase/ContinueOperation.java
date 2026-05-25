package com.indivaragroup.switchcase;

public class ContinueOperation {

    public void contohContinue() {

        System.out.println("=== CONTINUE ===");

        for (int i = 1; i <= 10; i++) {

            // skip angka 5
            if (i == 5) {
                System.out.println("Skip angka " + i);
                continue;
            }

            System.out.println("Angka: " + i);
        }
    }
}