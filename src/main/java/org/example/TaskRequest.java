package org.example;

import org.example.decorator.TagDecorator;

public class TaskRequest {
    private Task task;

    private String description;
    private String tag;

    public TaskRequest(String description, String tagDecorator){
        this.description=description;
        this.task = new Task(description);
        this.tag=tagDecorator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
