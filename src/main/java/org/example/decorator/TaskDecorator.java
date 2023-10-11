package org.example.decorator;

public class TaskDecorator implements ITask {
    private ITask task;

    TaskDecorator(ITask task) {
        this.task = task;
    }

    @Override
    public String getDescription() {
        return task.getDescription();
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
