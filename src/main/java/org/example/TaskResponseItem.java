package org.example;

public class TaskResponseItem {
    private String description;
    private String tag;
    private int priority;
    private boolean completed;

    public TaskResponseItem(String description, String tag, int priority, boolean completed) {
        this.description = description;
        this.tag = tag;
        this.priority = priority;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
