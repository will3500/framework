package org.example.Singleton;

import org.example.decorator.ITask;
import org.example.decorator.TaskDecorator;

import java.util.ArrayList;
import java.util.List;

public class TaskListSingleton {
    private static TaskListSingleton instance;
    private List<ITask> tasks;

    private TaskListSingleton() {
        tasks = new ArrayList<>();
    }

    public static TaskListSingleton getInstance() {
        if (instance == null) {
            instance = new TaskListSingleton();
        }
        return instance;
    }

    public List<ITask> getTasks() {
        return tasks;
    }

    public void addTask(ITask task) {
        tasks.add(task);
    }
}