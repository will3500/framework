package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.decorator.TaskDecorator;

public class Task implements TaskDecorator {
    private String description;
    private boolean completed;


    public Task( String description) {
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
