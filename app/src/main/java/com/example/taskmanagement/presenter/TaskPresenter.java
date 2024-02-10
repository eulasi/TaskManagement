package com.example.taskmanagement.presenter;

import com.example.taskmanagement.model.TaskModel;
import com.example.taskmanagement.model.TaskRepository;
import com.example.taskmanagement.view.TaskView;

import java.util.List;

/**
 * The TaskPresenter class acts as an intermediary between the TaskRepository and the TaskView. It fetches data from the repository and updates the view accordingly.
 **/

// The presenter acts as a mediator between the view and the model. It fetches data from the model, processes it, and updates the view accordingly.
public class TaskPresenter {
    // The view and the repository are injected into the presenter.
    private TaskView view;
    private TaskRepository repository;

    // The constructor takes the view and the repository as parameters.
    public TaskPresenter(TaskView view, TaskRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    // The loadTasks method fetches the tasks from the repository and passes them to the view.
    public void loadTasks() {
        List<TaskModel> tasks = repository.getAllTasks();
        view.showTasks(tasks);
    }

    // The addTask method saves the task to the repository and updates the view.
    public void addTask(TaskModel task) {
        repository.saveTask(task);
        view.showTaskAddedMessage();
    }

    // The deleteTask method deletes the task from the repository and updates the view.
    public void deleteTask(TaskModel task) {
        repository.deleteTask(task);
        view.showTaskDeletedMessage();
    }

}
