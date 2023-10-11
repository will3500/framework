package org.example;

public class TaskRequest {
    private String description;
    private int priority;
    private String tag;

    public String getDescription() {
        if(description.contains("#")){
            description = description.replaceAll("\\#","x");
            return description;
        }
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
