package com.project.todoapp.controller;

import com.project.todoapp.dto.TaskDTO;
import com.project.todoapp.mapper.TaskMapper;
import com.project.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/task")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskMapper taskMapper;

    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks(){
        return  ResponseEntity.ok(taskService.findAllTasks());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TaskDTO> findTaskById(@PathVariable Long id){
        return ResponseEntity.ok(taskService.findTaskById(id));

    }

//    public LogMonitorJiraDTO findById(@PathVariable("id") Integer id) {
//        LogMonitorJira logMonitorJira = logMonitorJiraService.findById(id).orElse(null);
//        return logMonitorJiraMapper.asDTO(logMonitorJira);
//    }
}

