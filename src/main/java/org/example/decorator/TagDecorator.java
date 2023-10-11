package org.example.decorator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.Task;

public class TagDecorator implements TaskDecorator {
    private Task task;
    private String tag;

    public TagDecorator(Task task, String tag) {
        this.task = task;
        this.tag = tag;
    }

    @Override
    public String getDescription() {
        return task.getDescription() + " !" + tag;
    }

    @Override
    public boolean isCompleted() {
        return task.isCompleted();
    }

    @Override
    public void markCompleted() {
        task.markCompleted();
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
