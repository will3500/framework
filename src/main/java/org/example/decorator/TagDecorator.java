package org.example.decorator;

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


}
