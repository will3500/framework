package org.example;

import org.example.decorator.PriorityDecorator;
import org.example.decorator.TagDecorator;
import org.example.decorator.ITask;
import org.example.decorator.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskList taskList = TaskList.getInstance();

    @GetMapping
    public List<ITask> getTasks() {
        return taskList.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody TaskRequest taskRequest) {
        ITask task = new Task(taskRequest.getDescription());
        if (taskRequest.getTag() != null && !taskRequest.getTag().isEmpty()) {
            task = new TagDecorator(task, taskRequest.getTag());
        }
        if (taskRequest.getPriority() != 0 ) {
            task = new PriorityDecorator(task, taskRequest.getPriority()); // Adiciona a prioridade à tarefa, se existir
        }
        taskList.addTask(task);
    }

    @PostMapping("/{index}/complete")
    public void markTaskAsCompleted(@PathVariable int index) {
        List<ITask> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            ITask taskD = tasks.get(index);
            taskD.markCompleted();

        }
    }
}
