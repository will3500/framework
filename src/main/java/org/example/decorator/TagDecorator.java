package org.example.decorator;

public class TagDecorator extends TaskDecorator {
    private ITask task;
    private String tag;

    public TagDecorator(ITask task, String tag) {
        super(task);
        this.tag=tag;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " #TAG:" + tag;
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
