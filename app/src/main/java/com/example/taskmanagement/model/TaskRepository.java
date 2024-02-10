package com.example.taskmanagement.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for managing the tasks. It provides data operations to retrieve all tasks, save a new task, and delete an existing task.
 **/

public class TaskRepository {
    // This list stores all the tasks
    private List<TaskModel> tasks;

    public TaskRepository() {
        // Initialize the tasks list
        tasks = new ArrayList<>();
    }

    public List<TaskModel> getAllTasks() {
        // Return a copy of the tasks list
        return new ArrayList<>(tasks);
    }

    public void saveTask(TaskModel task) {
        // Add the task to the tasks list
        tasks.add(task);
    }

    public void deleteTask(TaskModel task) {
        // Remove the task from the tasks list
        tasks.remove(task);
    }
}
