package com.indivaragroup.challlenge;

public class ChallengeThree {
    public void challengeThree() {

        /*
        Membuat sistem parkir
        Ada dua jenis kendaraan: Motor dan Mobil
        Motor: 1 jam awal 5k, jam selanjutnya 3k. Maks 30k
        Mobil: 1 jam awal 8k, jam selanjutnya 5k. Maks 50k
        */

        String jenisKendaraan = "Motor";

        int jamMasuk = 13;
        int jamKeluar = 13;

        int lamaParkir;
        int totalBiaya = 0;

        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (24 - jamMasuk) + jamKeluar;
        }

        if (lamaParkir == 0) {
            lamaParkir = 1;
        }

        if (jenisKendaraan == "Motor") {

            totalBiaya = 5000 + ((lamaParkir - 1) * 3000);

            if (totalBiaya > 30000) {
                totalBiaya = 30000;
            }

        }
        else if (jenisKendaraan == "Mobil") {

            totalBiaya = 8000 + ((lamaParkir - 1) * 5000);

            if (totalBiaya > 50000) {
                totalBiaya = 50000;
            }

        }

        else {

            System.out.println("Jenis kendaraan tidak valid");
            return;

        }

        System.out.println("=== Struk Parkir ===");
        System.out.println("Kendaraan   : " + jenisKendaraan);
        System.out.println("Jam Masuk   : " + jamMasuk + ":00");
        System.out.println("Jam Keluar  : " + jamKeluar + ":00");
        System.out.println("Durasi      : " + lamaParkir + " jam");
        System.out.println("Total Bayar : Rp " + totalBiaya);

    }
}


/*
sistem kredit rumah
input ada 5 gaji, umur, harga rumah, lamanya cicilan/tenor, cicilan per bulan
cicilan per bulan adalah harga rumah dibagi lama cicilan dikali 12
requirementsnya
kalo umurnya kurang dari 21 tahun pengajuan ditolak, outputnya langsung ditolak
jika lama cicilan lebih besar daripada 20 ditolak juga karna cicilannya terlalu lama
jika cicilan per bulannya lebih dari 40% gaji, maka gajinya gak cukup
kalau gajinya di atas 15jt cicilan perbulannya lebih kecil sama dengan 30% gaji maka high value kreditor maka langsung approve selaiin itu maka yang kredit normal
kalau gajinya 7jt - 14999k dan umurnya lebih dari 25 maka kreditnya juga disetujui
kalau di bawah 25 maka dan di atas 21 maka butuh penjamin
kalau gajinya lebih kecil dari 7 jt dan laam cicilannya lebih besar sama dengan 15 tahun maka resiko kreditnya tinggi selain itu brt pengajuannya boleh dipertimbangkan
outputnya brt ada 9 dan output ini random, ada yang mengarah ke umur, ke duit, ke lama cicilan/tenor. jadi nanti hasil akhirnya 3. secara umur kualified apa ngga, secara gaji amaar apa ngga dll
outputnya ada yang butuh penjamin atau gak juga trus valuenya dia gmn
 umur 24 gaji 15 ambil cicilan selama 16 tahun brt gua adalah customer high value
 */