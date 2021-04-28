package com.project.todoapp.service;

import com.project.todoapp.dto.TaskDTO;
import com.project.todoapp.dto.TaskInsertDTO;
import com.project.todoapp.mapper.TaskInsertMapper;
import com.project.todoapp.mapper.TaskMapper;
import com.project.todoapp.model.Task;
import com.project.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskInsertMapper taskInsertMapper;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskMapper taskMapper;

       public List<TaskDTO> findAllTasks(){
           List<Task> listTask = taskRepository.findAll();
           return taskMapper.asDTOList(listTask);
       }

       public TaskDTO findTaskById(Long id) {
           Task taskById = taskRepository.findById(id).orElse(null);
           return taskMapper.asDTO(taskById);
       }

        public TaskDTO insertTask(TaskInsertDTO taskInsertdto){
            Task task = taskInsertMapper.asEntity(taskInsertdto);
            Task taskSave = taskRepository.save(task);
                return taskMapper.asDTO(taskSave);
       }

        public TaskDTO updateTask(TaskDTO taskdto, Long id) {
            Optional<Task> foundId = taskRepository.findById(id);
            if (foundId.isPresent()){
                Task task = taskMapper.asEntity(taskdto);
                return taskMapper.asDTO(taskRepository.save(task));
            }
            return null;
        }

        public void deleteTaskById(Long id){
           Optional <Task> foundId = taskRepository.findById(id);
           if(foundId.isPresent()){
               taskRepository.deleteById(id);
           }

        }
}
