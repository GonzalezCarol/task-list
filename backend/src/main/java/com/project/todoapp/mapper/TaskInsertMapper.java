package com.project.todoapp.mapper;

import com.project.todoapp.dto.TaskInsertDTO;
import com.project.todoapp.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskInsertMapper extends GenericMapper<Task, TaskInsertDTO> {


    @Override
    @Mapping(target = "id")
    Task asEntity(TaskInsertDTO taskDto);

    @Override
    @Mapping(target = "id")
    TaskInsertDTO asDTO(Task task);
}
