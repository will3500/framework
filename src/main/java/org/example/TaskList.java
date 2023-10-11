package org.example;

import org.example.decorator.TaskDecorator;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private static TaskList instance;
    private List<TaskDecorator> tasks;

    private TaskList() {
        tasks = new ArrayList<>();
    }

    public static TaskList getInstance() {
        if (instance == null) {
            instance = new TaskList();
        }
        return instance;
    }

    public List<TaskDecorator> getTasks() {
        return tasks;
    }

    public void addTask(TaskDecorator task) {
        tasks.add(task);
    }
}