package org.example.decorator;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Task implements ITask {
    private String description;
    private boolean completed;


    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    @Override
    @JsonIgnore
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}
