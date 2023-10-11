package org.example;

import org.example.decorator.TagDecorator;
import org.example.decorator.TaskDecorator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskList taskList = TaskList.getInstance();

    @GetMapping
    public List<TaskDecorator> getTasks() {
        return taskList.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody TaskRequest taskRequest) {
        Task task = new Task(taskRequest.getDescription());
        TaskDecorator decoratedTask = new TagDecorator(task, taskRequest.getTag());
        taskList.addTask(decoratedTask);
    }

    @PostMapping("/{index}/complete")
    public void markTaskAsCompleted(@PathVariable int index) {
        List<TaskDecorator> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            TaskDecorator taskD = tasks.get(index);
            taskD.markCompleted();

        }
    }
}
