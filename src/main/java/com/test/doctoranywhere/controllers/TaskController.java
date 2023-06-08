package com.test.doctoranywhere.controllers;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.doctoranywhere.models.Task;
import com.test.doctoranywhere.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;
    
    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{inputId}")
    public ResponseEntity<Task> getTaskById(@PathVariable("inputId") Long inputId) {
        Optional<Task> task = taskRepository.findById(inputId);
        if (!task.isEmpty()) {
            return ResponseEntity.ok(task.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{updateId}")
    public ResponseEntity<Task> updateTask(@PathVariable("updateId") Long updateId, @RequestBody Task updatedTask) {
        Optional<Task> optionalTask = taskRepository.findById(updateId);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            // Assume only the completed status can be changed
            // task.setTitle(updatedTask.getTitle());
            // task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            taskRepository.save(task);
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (!optionalTask.isEmpty()) {
            taskRepository.deleteById(id);
        return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
