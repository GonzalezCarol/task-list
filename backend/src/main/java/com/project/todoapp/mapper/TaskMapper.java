package com.project.todoapp.mapper;

import com.project.todoapp.dto.TaskDTO;
import com.project.todoapp.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskMapper extends GenericMapper<Task, TaskDTO> {

    @Override
    @Mapping(target = "id")
    Task asEntity(TaskDTO taskDto);

    @Override
    @Mapping(target = "id")
    TaskDTO asDTO(Task task);
}
