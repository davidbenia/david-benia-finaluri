package edu.btu.david.benia.davidbenia2.controller;

import edu.btu.david.benia.davidbenia2.dto.task.AddTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.DeleteTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.GetTasksOutput;
import edu.btu.david.benia.davidbenia2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("get-tasks")
    public GetTasksOutput getTasks(){
        return taskService.getTasks();
    }

    @PostMapping("add-task")
    public void addTask(@RequestBody AddTaskInput addTaskInput){
        taskService.addTask(addTaskInput);
    }

    @PostMapping("delete-task")
    public void deleteTask(@RequestBody DeleteTaskInput deleteTaskInput){
        taskService.deleteTask(deleteTaskInput);
    }
}
