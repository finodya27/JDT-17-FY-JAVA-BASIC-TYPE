package com.indivaragroup.method;

public class MethodOperation {

    public void runAllMethods() {

        String nama = "Random";
        int a = 10;
        int b = 5;

        System.out.println("=== VOID METHOD ===");
        tampilkanPesan();

        System.out.println();

        System.out.println("=== PARAMETER METHOD ===");
        salam(nama);

        System.out.println();

        System.out.println("=== RETURN METHOD ===");
        int hasil = tambah(a, b);
        System.out.println("Hasil penjumlahan: " + hasil);

        System.out.println();

        System.out.println("=== OVERLOADING ===");
        hitung(10, 5);
        hitung(10.5, 2.5);
        hitung(1, 2, 3);
    }

    // VOID METHOD
    public void tampilkanPesan() {
        System.out.println("Ini VOID METHOD");
    }

    // PARAMETER METHOD
    public void salam(String nama) {
        System.out.println("Halo, " + nama);
    }

    // RETURN METHOD
    public int tambah(int a, int b) {
        return a + b;
    }

    // OVERLOADING METHOD
    public void hitung(int a, int b) {
        System.out.println("Hasil int: " + (a + b));
    }

    public void hitung(double a, double b) {
        System.out.println("Hasil double: " + (a + b));
    }

    public void hitung(int a, int b, int c) {
        System.out.println("Hasil 3 angka: " + (a + b + c));
    }
}