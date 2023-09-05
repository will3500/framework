package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private static TaskList instance;
    private List<Task> tasks;

    private TaskList() {
        tasks = new ArrayList<>();
    }

    public static TaskList getInstance() {
        if (instance == null) {
            instance = new TaskList();
        }
        return instance;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}