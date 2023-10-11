package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private static TaskList instance;
    private List<TaskRequest> tasks;

    private TaskList() {
        tasks = new ArrayList<>();
    }

    public static TaskList getInstance() {
        if (instance == null) {
            instance = new TaskList();
        }
        return instance;
    }

    public List<TaskRequest> getTasks() {
        return tasks;
    }

    public void addTask(TaskRequest task) {
        tasks.add(task);
    }
}