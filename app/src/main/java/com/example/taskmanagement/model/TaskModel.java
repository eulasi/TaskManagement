package com.example.taskmanagement.model;

/**
 * This class represents a task in the task management application. It holds information about the title, description, and completion status of a task. It also provides methods to get and set the title, description, and completion status of a task and provides a method to check if a task is completed or not.
 **/

public class TaskModel {
    private String title;
    private String description;
    private boolean completed;

    // class represents a task in the task management application. It holds information about the title, description, and completion status of a task.
    public TaskModel(String title, String description, boolean completed) {
        // Stores the title of the task.
        this.title = title;
        // Stores the description of the task.
        this.description = description;
        // Stores the completion status of the task.
        this.completed = completed;
    }

    // Initializes the task with a title, description, and completion status.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}