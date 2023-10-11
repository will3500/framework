package org.example.decorator;

public class TagDecorator implements ITask {
    private ITask task;
    private String tag;

    public TagDecorator(ITask task, String tag) {
        this.task = task;
        this.tag = tag;
    }

    @Override
    public String getDescription() {
        return task.getDescription() + " #TAG:" + tag;
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
