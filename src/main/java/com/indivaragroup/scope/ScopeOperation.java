package com.indivaragroup.scope;

public class ScopeOperation {

    // INSTANCE VARIABLE (global dalam class)
    String nama = "Random";

    public void runScope() {

        System.out.println("=== SCOPE VARIABLE ===");

        // LOCAL VARIABLE
        int umur = 24;
        System.out.println("Local variable umur: " + umur);

        System.out.println("Instance variable nama: " + nama);

        // BLOCK SCOPE
        if (true) {
            int nilai = 90;
            System.out.println("Block scope nilai: " + nilai);
        }

        // System.out.println(nilai); // ERROR: tidak bisa diakses di luar block
    }

    public void contohLocalScope() {

        int x = 10;

        System.out.println("Local x di method ini: " + x);
    }
}