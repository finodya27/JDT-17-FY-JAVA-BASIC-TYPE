package com.indivaragroup.todoapp.model;

import java.util.ArrayList;

public class Task {
    // Bagian 3: Data Utama Task (Task ID, Title, Assignee, dll)
    public String id;
    public String title;
    public String assignee;
    public String status; // Menggunakan String (OPEN, IN_PROGRESS, READY_REVIEW, DONE, CANCELLED)
    public double estimatedHour;
    public double actualHour;
    public double weight;

    public ArrayList<SubTask> subtasks;

    public Task(String id, String title, String assignee, double estimatedHour, double weight) {
        this.id = id;
        this.title = title;
        this.assignee = assignee;
        this.estimatedHour = estimatedHour;
        this.weight = weight;

        // Default saat pertama dibuat
        this.status = "OPEN";
        this.actualHour = 0;
        this.subtasks = new ArrayList<>();
    }

    public void addSubTask(SubTask subtask) {
        this.subtasks.add(subtask);
    }
}