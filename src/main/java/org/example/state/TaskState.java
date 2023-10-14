package org.example.state;

import org.example.decorator.Task;

public interface TaskState {
    boolean isCompleted();
    void markComplete(Task task);
    void markIncomplete(Task task);
}