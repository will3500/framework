package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskList taskList = TaskList.getInstance();

    @GetMapping
    public List<Task> getTasks() {
        return taskList.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        taskList.addTask(task);
    }

    @PostMapping("/{index}/complete")
    public void markTaskAsCompleted(@PathVariable int index) {
        List<Task> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markCompleted();
            // Aqui você pode notificar os observadores sobre a conclusão da tarefa.
        }
    }
}
