package com.project.todoapp.service;

import com.project.todoapp.dto.TaskDTO;
import com.project.todoapp.mapper.TaskMapper;
import com.project.todoapp.model.Task;
import com.project.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskMapper taskMapper;

       public List<TaskDTO> findAllTasks(){
           List<Task> listTask = taskRepository.findAll();
           return taskMapper.asDTOList(listTask);
       }
       public TaskDTO findTaskById(Long id) {
           Task task = taskRepository.findById(id).orElse(null);
           return taskMapper.asDTO(task);
       };

}
