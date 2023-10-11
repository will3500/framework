package org.example;

import org.example.decorator.ITask;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private static TaskList instance;
    private List<ITask> tasks;

    private TaskList() {
        tasks = new ArrayList<>();
    }

    public static TaskList getInstance() {
        if (instance == null) {
            instance = new TaskList();
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