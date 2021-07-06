package edu.btu.david.benia.davidbenia2.dto.task;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    List<TaskDTO> taskDTOList;
}
