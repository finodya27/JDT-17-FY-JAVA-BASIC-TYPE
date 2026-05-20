package com.indivaragroup.grading.student;

public class GradeData {

    private GradeCalculation gradeCalculation = new GradeCalculation();

    private String[] names = {
            "Andi", "Budi", "Citra", "Dedi", "Eka",
            "Fajar", "Gina", "Hadi", "Indra", "Joko",
            "Kiki", "Lia", "Mira", "Nando", "Omar",
            "Putri", "Rina"
    };

    private int[] scores = {
            100, 90, 70, 60, 85,
            95, 40, 100, 75, 88,
            66, 90, 70, 55, 100,
            80, 45
    };

    // Nama method diubah dari execute() menjadi showGrades()
    public void showGrades() {
        for (int i = 0; i < names.length; i++) {
            gradeCalculation.calculateGrade(names[i], scores[i]);
        }
    }
}