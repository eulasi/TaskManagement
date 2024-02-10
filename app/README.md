# Task Management Application
The Task Management App is a software tool designed to help users organize and manage their tasks effectively.
- The TaskModel manages task data and operations, the TaskActivity handles the user interface elements related to task management, and the TaskPresenter coordinates communication between the View and Model.

## MVP Architecture
### Model (TaskModel)
The TaskModel encapsulates the data and logic related to tasks. It includes properties such as task title, description, due date, priority, etc.
It handles tasks' creation, deletion, modification, and retrieval from a data source, such as a local database or an API.

### View (TaskActivity)
The TaskActivity is responsible for presenting the user interface elements related to task management. It includes features like displaying a list of tasks, adding new tasks, editing existing tasks, and marking tasks as completed.
It implements the TaskView interface, defining methods to display tasks, show/hide loading indicators, and handle user interactions, such as clicking on a task to view details or editing a task.

### Presenter (TaskPresenter)
The TaskPresenter acts as an intermediary between the View and Model. It contains the application's business logic related to task management.
It receives user actions and interactions from the View, interacts with the TaskModel to perform operations on tasks, and updates the View accordingly.
The Presenter abstracts the task management process from the View, making it easier to test and maintain.

## Flow of Control
1) User Interaction:
The user interacts with the TaskActivity UI by performing actions such as adding a new task, editing an existing task, marking a task as completed, or viewing task details.

2) View Interaction with Presenter:
The TaskActivity forwards user actions (e.g., adding/editing tasks) to the TaskPresenter for processing.

3) Presenter Interaction with Model:
The TaskPresenter receives user actions from the TaskActivity and interacts with the TaskModel to perform corresponding operations on tasks (e.g., adding/editing/deleting tasks).

4) Model Updates Data:
The TaskModel performs CRUD (Create, Read, Update, Delete) operations on tasks based on the instructions received from the Presenter.

5) Presenter Updates View:
Upon receiving updates from the Model, the TaskPresenter instructs the TaskActivity to update the UI accordingly.
For example, if a new task is added, the Presenter notifies the View to refresh the task list display.

6) View Reflects Changes:
The TaskActivity receives instructions from the Presenter and updates the UI to reflect changes in the task list or task details.