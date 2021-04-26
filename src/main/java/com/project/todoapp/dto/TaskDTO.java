package com.project.todoapp.dto;

import com.project.todoapp.model.Task;
import lombok.Data;

@Data
public class TaskDTO {
    
    private Long id;
    private String description;
    private boolean done;

    public TaskDTO(){}

    public TaskDTO(Task entity){
        this.id = entity.getId();
        this.description = entity.getDescription();
        this.done = entity.getDone();
    }
}
