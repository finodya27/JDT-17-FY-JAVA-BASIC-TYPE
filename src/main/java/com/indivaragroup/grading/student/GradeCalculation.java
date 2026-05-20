package com.indivaragroup.grading.student;

public class GradeCalculation {

    public void calculateGrade(String name, int nilai) {

        System.out.println("Nama siswa: " + name);
        System.out.println("Nilai: " + nilai);

        switch (nilai) {

            case 100:
                System.out.println("Hasil: dia jago banget");
                break;

            case 90:
                System.out.println("Hasil: dia belum jago banget tapi jago aja");
                break;

            case 70:
                System.out.println("Hasil: dia biasa aja");
                break;

            default:
                if (nilai < 70) {
                    System.out.println("Hasil: perlu belajar lagi");
                } else {
                    System.out.println("Hasil: nilai tidak masuk kategori spesifik");
                }
                break;
        }

        System.out.println("----------------------------------");
    }
}