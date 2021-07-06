package edu.btu.david.benia.davidbenia2.dto.task;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    Date startDate;
    Date endDate;
}
