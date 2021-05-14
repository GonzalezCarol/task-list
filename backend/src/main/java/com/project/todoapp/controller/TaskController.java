package com.project.todoapp.controller;

import com.project.todoapp.dto.TaskDTO;
import com.project.todoapp.dto.TaskInsertDTO;
import com.project.todoapp.mapper.TaskMapper;
import com.project.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/task")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskMapper taskMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TaskDTO> getAllTasks(){
        return taskService.findAllTasks();
    }
    
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TaskDTO findTaskById(@PathVariable Long id){
        return taskService.findTaskById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO insertTask(@RequestBody TaskInsertDTO task){
        return taskService.insertTask(task);
    }
    
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TaskDTO updateTask(TaskDTO taskdto ,@PathVariable Long id){
        return taskService.updateTask(taskdto,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTaskById(id);
    }
}

