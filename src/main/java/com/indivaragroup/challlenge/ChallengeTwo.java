package com.indivaragroup.challlenge;

public class ChallengeTwo {
    public void challengeTwo(){

        /*
        1. untuk menentukan kelulusan
        2. ada 3 variabel yang diguanakan
        3. nilai tugas, nilai ujian, nilai absensi
        4. jika rata-rata dari 3 nilai tersebut lebih besar dari pada 75, maka lakukan print selamat anda lulus
        5. jika rata-rata 3 nilai tersebut lebih besar dari 90, print sebuah apresiasi
        6. jika rata-rata dari 3 nilai tersebut lebih kecil dari 65 dan 75 maka print informasi harus mengikuti remedial
        7. jika rata-rata dari 3 nilai tersebeut lebih kecil sama dengan 65 maka print ulang lagi taun depan
         */

        // 2 & 3: Mendeklarasikan 3 variabel nilai
        double nilaiTugas = 92;
        double nilaiUjian = 92;
        double nilaiAbsensi = 92;

        // Menghitung rata-rata
        double rataRata = (nilaiTugas + nilaiUjian + nilaiAbsensi) / 3;
        System.out.println("Nilai Rata-rata Anda: " + rataRata);

        // 4. Jika rata-rata > 75
        if (rataRata > 75 && rataRata <= 90) {
            System.out.println("Selamat Anda lulus!");
        }

        // 5. Jika rata-rata > 90 (Apresiasi)
        if (rataRata > 90) {
            System.out.println("Luar biasa! Nilai kamu sangat memuaskan, pertahankan!");
        }

        // 6. Jika rata-rata antara 65 dan 75 (<= 75 dan > 65)
        if (rataRata > 65 && rataRata <= 75) {
            System.out.println("Informasi: Anda harus mengikuti remedial.");
        }

        // 7. Jika rata-rata <= 65
        if (rataRata <= 65) {
            System.out.println("Maaf, silakan ulang lagi tahun depan.");
        }
    }
}
