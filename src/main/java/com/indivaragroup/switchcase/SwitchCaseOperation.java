package com.indivaragroup.switchcase;

public class SwitchCaseOperation {

    public void cekCuaca() {

        String[] daftarCuaca = {
                "cerah",
                "hujan",
                "berawan",
                "angin"
        };

        System.out.println("=== INFO CUACA ===");

        for (String cuaca : daftarCuaca) {

            switch (cuaca.toLowerCase()) {
                case "cerah":
                    System.out.println("Cuaca: Cerah -> Cocok untuk beraktivitas.");
                    break;

                case "berawan":
                    System.out.println("Cuaca: Berawan -> Masih aman untuk keluar.");
                    break;

                case "hujan":
                    System.out.println("Cuaca: Hujan -> Bawa payung.");
                    break;

                case "angin":
                    System.out.println("Cuaca: Angin -> Hati-hati saat keluar.");
                    break;

                default:
                    System.out.println("Cuaca tidak dikenali.");
            }
        }
    }
}