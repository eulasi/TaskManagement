package com.example.taskmanagement.view;

import com.example.taskmanagement.model.TaskModel;
import com.example.taskmanagement.presenter.TaskPresenter;

import java.util.List;

/**
 * The TaskActivity class implements the TaskView interface and handles UI-related tasks.
 **/

public class TaskActivity implements TaskView {
    // The presenter object is used to interact with the model and update the UI.
    private TaskPresenter presenter;

    // This method is used to set the presenter object.
    public void setPresenter(TaskPresenter taskPresenter) {
        this.presenter = taskPresenter;
    }

    // This method is used to add a task to the model.
    @Override
    public void showTasks(List<TaskModel> tasks) {
        // Display tasks in the UI
        for (TaskModel task : tasks) {
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println();
        }
    }

    //  Displays a message indicating that a task has been added.
    @Override
    public void showTaskAddedMessage() {
        // Display task added message in the UI
        System.out.println("Task added successfully.");
    }

    // Displays a message indicating that a task has been deleted.
    @Override
    public void showTaskDeletedMessage() {
        // Display task deleted message in the UI
        System.out.println("Task deleted successfully.");
    }
}
