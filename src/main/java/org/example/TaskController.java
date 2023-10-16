package org.example;

import org.example.Singleton.TaskListSingleton;
import org.example.decorator.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskListSingleton taskListSingleton = TaskListSingleton.getInstance();
    private TaskResponse taskResponse = new TaskResponse();
    @GetMapping
    public List<TaskResponseItem> getTasks() {
        return taskResponse.taskResponseJson();
    }

    @PostMapping
    public void addTask(@RequestBody TaskRequest taskRequest) {
        ITask task = new Task(taskRequest.getDescription());
        if (taskRequest.getTag() != null && !taskRequest.getTag().isEmpty()) {
            task = new TagDecorator(task, taskRequest.getTag());

        }
        if (taskRequest.getPriority() != 0 ) {
            task = new PriorityDecorator(task, taskRequest.getPriority());

        }

        taskListSingleton.addTask(task);
    }

    @PostMapping("/{index}/complete")
    public void markTaskAsCompleted(@PathVariable int index) {
        List<ITask> tasks = taskListSingleton.getTasks();
        if (index >= 0 && index < tasks.size()) {
            ITask taskD = tasks.get(index);
            taskD.markCompleted();

        }
    }
}
