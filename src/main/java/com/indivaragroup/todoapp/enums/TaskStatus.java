package com.indivaragroup.todoapp.enums;

public enum TaskStatus {
    OPEN(0),
    IN_PROGRESS(50),
    READY_REVIEW(80),
    DONE(100),
    CANCELLED(0);

    private final int progress;

    TaskStatus(int progress) {
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }
}
