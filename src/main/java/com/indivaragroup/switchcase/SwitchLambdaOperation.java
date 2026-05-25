package com.indivaragroup.switchcase;

public class SwitchLambdaOperation {

    public void cekCuaca() {

        String cuaca = "hujan";

        System.out.println("=== SWITCH LAMBDA ===");

        switch (cuaca.toLowerCase()) {
            case "cerah" -> System.out.println("Cuaca cerah, cocok aktivitas luar.");
            case "berawan" -> System.out.println("Cuaca berawan, masih aman.");
            case "hujan" -> System.out.println("Cuaca hujan, bawa payung.");
            case "petir" -> System.out.println("Cuaca petir, hindari keluar rumah.");
            default -> System.out.println("Cuaca tidak diketahui.");
        }
    }
}