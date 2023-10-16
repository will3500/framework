package org.example.decorator;

public class TaskDecorator implements ITask {
    private ITask itask;

    public TaskDecorator(ITask task) {
        itask = task;
    }

    @Override
    public String getDescription() {
        return itask.getDescription();
    }

    @Override
    public boolean isCompleted() {
        return itask.isCompleted();
    }

    @Override
    public void markCompleted() {
        itask.markCompleted();
    }
}
