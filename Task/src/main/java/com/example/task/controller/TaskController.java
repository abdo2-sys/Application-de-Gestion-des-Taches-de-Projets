package com.example.task.controller;

import com.example.task.entity.Task;
import com.example.task.entity.TaskStatus;
import com.example.task.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task creerTache(@RequestBody Task task) {
        return service.creerTache(task);
    }

    @GetMapping("/project/{projectId}")
    public List<Task> getTasksByProject(@PathVariable Long projectId) {
        return service.getTachesParProjet(projectId);
    }

    @PutMapping("/{taskId}/status")
    public Task updateStatus(@PathVariable Long taskId, @RequestParam TaskStatus status) {
        return service.changerStatut(taskId, status);
    }
}
