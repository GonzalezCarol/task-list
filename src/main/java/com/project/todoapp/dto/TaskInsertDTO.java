package com.project.todoapp.dto;

import com.project.todoapp.model.Task;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInsertDTO {

    private String description;
    private boolean done;
    private LocalDateTime datecreated;

    public TaskInsertDTO(){}

    public TaskInsertDTO(Task entity) {

        entity.getDescription();
        entity.getDone();
        entity.getDatecreated();

    }
}
