package com.indivaragroup.todoapp.service;

import java.util.ArrayList;
import com.indivaragroup.todoapp.model.SubTask;
import com.indivaragroup.todoapp.model.Task;

public class TaskManager {

    // Bagian 4.1 & 4.2: Progress Berdasarkan Status & Subtask
    public double calculateTaskProgress(Task task) {
        // Bagian 5: Business Rules no 1 & 5 -> Jika Done otomatis 100%
        if (task.status.equals("DONE")) return 100.0;

        // Bagian 5: Business Rules no 3 -> Cancelled tidak dihitung
        if (task.status.equals("CANCELLED")) return 0.0;

        // Bagian 4.2: Progress Berdasarkan Subtask (Jumlah Subtask Done / Total Subtask x 100)
        if (!task.subtasks.isEmpty()) {
            int doneCount = 0;
            for (SubTask st : task.subtasks) {
                if (st.isDone) {
                    doneCount++;
                }
            }
            return ((double) doneCount / task.subtasks.size()) * 100;
        }

        // Bagian 4.1: Progress Berdasarkan Status (Open=0%, In Progress=50%, Ready Review=80%)
        if (task.status.equals("OPEN")) {
            return 0.0;
        } else if (task.status.equals("IN_PROGRESS")) {
            return 50.0;
        } else if (task.status.equals("READY_REVIEW")) {
            return 80.0;
        }

        return 0.0;
    }

    // Bagian 4.3 & 6: Progress Project (Rekomendasi MVP)
    public double calculateProjectProgress(ArrayList<Task> projectTasks) {
        double totalWeight = 0;
        double accumulatedProgress = 0;

        for (Task task : projectTasks) {
            // Bagian 5: Business Rules no 3 -> Task Cancelled tidak dihitung
            if (task.status.equals("CANCELLED")) continue;

            totalWeight += task.weight;
            double taskProgress = calculateTaskProgress(task);

            // Bagian 6: Rekomendasi MVP -> Progress = Bobot Task x Status Percentage
            accumulatedProgress += task.weight * (taskProgress / 100.0);
        }

        if (totalWeight == 0) return 0.0;
        return (accumulatedProgress / totalWeight) * 100;
    }

    // Bagian 4.4: Workload Assignee
    public double calculateWorkload(ArrayList<Task> allTasks, String assigneeName) {
        double totalWorkload = 0;

        for (Task task : allTasks) {
            // Hanya hitung task aktif milik assignee tertentu
            if (task.assignee.equals(assigneeName)) {
                // Bagian 4.4: Task aktif = Open + In Progress + Ready Review
                if (task.status.equals("OPEN") ||
                        task.status.equals("IN_PROGRESS") ||
                        task.status.equals("READY_REVIEW")) {

                    // Workload = Total Estimated Hour task aktif
                    totalWorkload += task.estimatedHour;
                }
            }
        }
        return totalWorkload;
    }

    // Bagian 4.5: Variance Estimasi vs Aktual
    public double calculateVariance(Task task) {
        // Variance = Actual Hour - Estimated Hour
        return task.actualHour - task.estimatedHour;
    }

    // Bagian 4.6: Produktivitas Task
    public double calculateProductivity(Task task) {
        if (task.actualHour == 0) return 0.0; // Cegah program crash jika dibagi nol

        // Productivity = (Estimated Hour / Actual Hour) x 100
        return (task.estimatedHour / task.actualHour) * 100;
    }
}