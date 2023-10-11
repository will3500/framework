package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.decorator.TaskDecorator;

public class Task implements TaskDecorator {
    private String description;
    private boolean completed;
    private String tag;

    @JsonCreator
    public Task(@JsonProperty("description") String description, @JsonProperty("tag") String tag) {
        this.description = description;
        this.completed = false;
        this.tag = tag;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getTag(){
        if (tag != null && !tag.isEmpty()) {
            return  tag;
        }
        return null;
    }
    public void setTag(String tag) {

        this.tag = tag;
    }
    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}
