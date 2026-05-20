package com.indivaragroup.type.data;

public class TypeDataArray {

    public void execute() {

        // ARRAY LANGSUNG ISI DATA
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("=== ARRAY DATA ===");

        System.out.println("Nilai array [1][2] = " + data[1][2]);

        System.out.println("Jumlah baris = " + data.length);
        System.out.println("Jumlah kolom = " + data[0].length);
        System.out.println("Total element = " + (data.length * data[0].length));

        System.out.println("\nISI ARRAY:");

        for (int[] row : data) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        // MATRIX (ARRAY KOSONG DULU)
        int[][] matrix = new int[2][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;

        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        System.out.println("\n=== MATRIX ===");

        System.out.println("Nilai matrix [1][2] = " + matrix[1][2]);

        System.out.println("Jumlah baris = " + matrix.length);
        System.out.println("Jumlah kolom = " + matrix[0].length);
        System.out.println("Total element = " + (matrix.length * matrix[0].length));

        System.out.println("\nISI MATRIX:");

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}