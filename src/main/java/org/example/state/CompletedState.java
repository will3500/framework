package org.example.state;

import org.example.decorator.Task;

public class CompletedState implements TaskState {
    @Override
    public boolean isCompleted() {
        return true;
    }
    @Override
    public void markComplete(Task task) {
        System.out.println("A tarefa já está completa.");
    }

    @Override
    public void markIncomplete(Task task) {
        System.out.println("Reabrindo a tarefa.");
        task.setState(new IncompleteState());
    }
}
