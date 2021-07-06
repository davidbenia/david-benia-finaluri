package edu.btu.david.benia.davidbenia2.service;

import edu.btu.david.benia.davidbenia2.dto.task.AddTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.DeleteTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.GetTasksOutput;

public interface TaskService {
    GetTasksOutput getTasks();
    void addTask(AddTaskInput addTaskInput);
    void deleteTask(DeleteTaskInput deleteTaskInput);
}
