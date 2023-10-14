package org.example.state;

import org.example.decorator.Task;

public class IncompleteState implements TaskState {
    @Override
    public boolean isCompleted() {
        return false;
    }
    @Override
    public void markComplete(Task task) {
        System.out.println("Marcando tarefa como completa.");
        task.setState(new CompletedState());
    }

    @Override
    public void markIncomplete(Task task) {
        System.out.println("A tarefa já está incompleta.");
    }
}