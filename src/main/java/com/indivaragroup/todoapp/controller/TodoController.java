package com.indivaragroup.todoapp.controller;

import com.indivaragroup.todoapp.model.SubTask;
import com.indivaragroup.todoapp.model.Task;
import com.indivaragroup.todoapp.service.TaskManager;

import java.util.ArrayList;

public class TodoController {
    private TaskManager manager;
    private ArrayList<Task> projectTasks;

    public TodoController() {
        this.manager = new TaskManager();
        this.projectTasks = new ArrayList<>();
    }

    public void run() {
        System.out.println("Memulai Todo App...\n");
        initData();
        showReports();
    }

    private void initData() {
        // Simulasi pembuatan Task sesuai Contoh 4.3 dan 4.5
        Task task1 = new Task("T1", "Backend API", "Budi", 8.0, 40.0);
        task1.status = "IN_PROGRESS";
        task1.actualHour = 10.0; // Contoh 4.5: Estimated 8 jam, Actual 10 jam

        Task task2 = new Task("T2", "Frontend UI", "Budi", 10.0, 30.0);
        task2.status = "OPEN";
        // Simulasi Subtask (Contoh 4.2)
        task2.addSubTask(new SubTask("Setup UI Framework", true));
        task2.addSubTask(new SubTask("Slicing UI", false));

        projectTasks.add(task1);
        projectTasks.add(task2);
    }

    private void showReports() {
        Task task1 = projectTasks.get(0);
        Task task2 = projectTasks.get(1);

        System.out.println("=== PROGRESS ===");
        System.out.println("Progress Task 1 (" + task1.title + "): " + manager.calculateTaskProgress(task1) + "%");
        System.out.println("Progress Task 2 (" + task2.title + "): " + manager.calculateTaskProgress(task2) + "%");
        System.out.println("Total Project Progress: " + manager.calculateProjectProgress(projectTasks) + "%");

        System.out.println("\n=== PERFORMANCE (Task 1) ===");
        System.out.println("Variance: " + manager.calculateVariance(task1) + " jam");
        System.out.println("Produktivitas: " + manager.calculateProductivity(task1) + "%");

        System.out.println("\n=== WORKLOAD ===");
        System.out.println("Workload Budi: " + manager.calculateWorkload(projectTasks, "Budi") + " jam");
    }
}