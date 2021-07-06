package edu.btu.david.benia.davidbenia2.service.impl;

import edu.btu.david.benia.davidbenia2.dto.task.AddTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.DeleteTaskInput;
import edu.btu.david.benia.davidbenia2.dto.task.GetTasksOutput;
import edu.btu.david.benia.davidbenia2.dto.task.TaskDTO;
import edu.btu.david.benia.davidbenia2.model.Task;
import edu.btu.david.benia.davidbenia2.repository.TaskRepository;
import edu.btu.david.benia.davidbenia2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTasksOutput getTasks() {
        List<Task> taskList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();
        GetTasksOutput getTasksOutput = new GetTasksOutput();

        for(Task task : taskList){
            TaskDTO taskDTO = new TaskDTO();

            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());

            taskDTOList.add(taskDTO);
        }
        getTasksOutput.setTaskDTOList(taskDTOList);

        return getTasksOutput;
    }

    @Override
    public void addTask(AddTaskInput addTaskInput) {
        Task task = new Task();

        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepository.save(task);
    }

    @Override
    public void deleteTask(DeleteTaskInput deleteTaskInput) {
        taskRepository.deleteById(deleteTaskInput.getId());
    }
}
