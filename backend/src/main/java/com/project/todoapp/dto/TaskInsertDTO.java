package com.project.todoapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.todoapp.model.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskInsertDTO {

    @JsonProperty("id")
    private long id;

    @JsonProperty("description")
    private String description;

    @JsonProperty("done")
    private boolean done;

    @JsonProperty("datecreated")
    private String datecreated;


}
