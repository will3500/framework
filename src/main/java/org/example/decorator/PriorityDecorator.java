package org.example.decorator;

public class PriorityDecorator extends TaskDecorator {
    private ITask task;
    private Integer priority;

    public PriorityDecorator(ITask task, Integer priority) {
        super(task);
        this.priority = priority;
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " #priority:" + priority;
    }

    @Override
    public boolean isCompleted() {
        return super.isCompleted();
    }

    @Override
    public void markCompleted() {
        super.markCompleted();
    }
}
