package org.example.decorator;

public class PriorityDecorator implements ITask {
    private ITask task;
    private Integer priority;

    public PriorityDecorator(ITask task, Integer priority) {
        this.task = task;
        this.priority = priority;
    }

    @Override
    public String getDescription() {

        return task.getDescription() + " #priority:" + priority;
    }

    @Override
    public boolean isCompleted() {
        return task.isCompleted();
    }

    @Override
    public void markCompleted() {
        task.markCompleted();
    }
}
