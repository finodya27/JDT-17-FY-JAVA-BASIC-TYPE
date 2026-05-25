package com.indivaragroup.switchcase;

public class SwitchYieldOperation {

    public void cekCuaca() {

        String cuaca = "hujan";

        System.out.println("=== SWITCH YIELD ===");

        String hasil = switch (cuaca.toLowerCase()) {

            case "cerah" -> {
                yield "Cuaca cerah, cocok aktivitas luar.";
            }

            case "berawan" -> {
                yield "Cuaca berawan, masih aman.";
            }

            case "hujan" -> {
                yield "Cuaca hujan, bawa payung.";
            }

            case "petir" -> {
                yield "Cuaca petir, hindari keluar rumah.";
            }

            default -> {
                yield "Cuaca tidak diketahui.";
            }
        };

        System.out.println(hasil);
    }
}