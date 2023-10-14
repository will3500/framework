package org.example.decorator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.state.CompletedState;
import org.example.state.IncompleteState;
import org.example.state.TaskState;

public class Task implements ITask {
    private String description;

    private TaskState state;

    public Task(String description) {
        this.description = description;
        this.state = new IncompleteState();
    }

    public void setState(TaskState state) {
        this.state = state;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isCompleted() {
        return state instanceof CompletedState;
    }
    @Override
    public void markCompleted() {
        state.markComplete(this);
    }

    public void markIncomplete() {
        state.markIncomplete(this);
    }
}
