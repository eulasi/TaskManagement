package com.example.taskmanagement.view;

import com.example.taskmanagement.model.TaskModel;

import java.util.List;

/**
 * This is the view layer of the application. It Defines operations for updating the UI to display tasks and adding messages for task addition and deletion.
 **/

// This interface defines the contract for the view layer of the application. It contains methods to display tasks and show messages related to task operations.
public interface TaskView {
    // This method is used to display tasks.
    void showTasks(List<TaskModel> tasks);

    // This method is used to show messages related to task operations.
    void showTaskAddedMessage();

    // This method is used to show messages related to task operations.
    void showTaskDeletedMessage();
}