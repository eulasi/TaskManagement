package com.example.taskmanagement;

import com.example.taskmanagement.model.TaskModel;
import com.example.taskmanagement.model.TaskRepository;
import com.example.taskmanagement.presenter.TaskPresenter;
import com.example.taskmanagement.view.TaskActivity;
import com.example.taskmanagement.view.TaskView;

/**
    The main class of the application. It creates instances of the view, presenter, and repository, sets up their dependencies, and interacts with them. It also demonstrates the functionality of loading tasks, adding a new task, and deleting a task.
 **/

public class Main {
    public static void main(String[] args) {
        // Create instances of view, presenter, and repository
        TaskView taskView = new TaskActivity();
        TaskRepository taskRepository = new TaskRepository();
        TaskPresenter taskPresenter = new TaskPresenter(taskView, taskRepository);

        // Set presenter for the view
        ((TaskActivity) taskView).setPresenter(taskPresenter);

        //demonstrates the functionality of loading tasks, adding a new task, and deleting a task.
        taskPresenter.loadTasks();

        TaskModel newTask = new TaskModel("New Task", "Description of the new task", false);
        taskPresenter.addTask(newTask);

        TaskModel taskToDelete = new TaskModel("Task to Delete", "Description of the task to delete", true);
        taskPresenter.deleteTask(taskToDelete);
    }
}