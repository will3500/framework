package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskList taskList = TaskList.getInstance();

    @GetMapping
    public List<TaskRequest> getTasks() {
        return taskList.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody TaskRequest taskReq) {
        TaskRequest taskR = new TaskRequest(taskReq.getDescription(),taskReq.getTag());
        taskList.addTask(taskR);
    }

    @PostMapping("/{index}/complete")
    public void markTaskAsCompleted(@PathVariable int index) {
        List<TaskRequest> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            TaskRequest taskRequest = tasks.get(index);
            taskRequest.getTask().markCompleted();

        }
    }
}
