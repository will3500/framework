package org.example;

import org.example.Singleton.TaskListSingleton;
import org.example.decorator.ITask;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskResponse {
    private TaskListSingleton taskListSingleton = TaskListSingleton.getInstance();

    public List<TaskResponseItem> taskResponseJson() {
        List<ITask> tasks = taskListSingleton.getTasks();
        List<TaskResponseItem> responseItems = new ArrayList<>();

        for (ITask task : tasks) {
            String description = task.getDescription();
            String tag = extractTag(description);
            int priority = extractPriority(description);
            boolean completed = task.isCompleted();
            String cleanDescription = cleanDescription(description);

            TaskResponseItem responseItem = new TaskResponseItem(cleanDescription, tag, priority,completed);
            responseItems.add(responseItem);
        }

        return responseItems;
    }

    private String extractTag(String description) {
        Pattern pattern = Pattern.compile("#TAG:(\\w+)");
        Matcher matcher = pattern.matcher(description);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private int extractPriority(String description) {
        Pattern pattern = Pattern.compile("#priority:(\\d+)");
        Matcher matcher = pattern.matcher(description);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }

    private String cleanDescription(String description) {

        description = description.replaceAll("#TAG:\\w+", "");
        description = description.replaceAll("#priority:\\d+", "");
        description = description.trim();
        return description;
    }



}

