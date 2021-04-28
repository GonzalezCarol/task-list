package com.project.todoapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.todoapp.model.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("description")
    private String description;

    @JsonProperty("done")
    private boolean done;

}
