package com.indivaragroup.expression;

public class Expression {
    public void expressionFunction(){
        int a = 10;
        int b = 5;

        int hasil1 = a + b;                     // 15
        boolean hasil2 = a > b;                 // true
        String hasil3 = "Halo" + "Dunia";       // "Halo Dunia
        int hasil4 = (a * 2) - b;               // 15
        double hasil5 = Math.sqrt(16);          // 4,0

        // Contoh expression yang menghasilkan single value
        int total = (3 + 7) * 2;
        boolean cek = (10 % 2) == 0;
        String nama = "Java".toUpperCase();

        System.out.println("hasil1 = " + hasil1);
        System.out.println("hasil2 = " + hasil2);
        System.out.println("hasil3 = " + hasil3);
        System.out.println("hasil4 = " + hasil4);
        System.out.println("hasil5 = " + hasil5);

        System.out.println("total = " + total);
        System.out.println("cek = " + cek);
        System.out.println("nama = " + nama);
    }
}
