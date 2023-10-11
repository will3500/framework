package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.decorator.TaskDecorator;

public class Task implements TaskDecorator {
    private String description;
    private boolean completed;


    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    @Override
    public String getDescription() {
        return description;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}
