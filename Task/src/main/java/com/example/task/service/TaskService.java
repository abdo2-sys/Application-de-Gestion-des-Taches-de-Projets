package com.example.task.service;

import com.example.task.client.ProjectClient;
import com.example.task.entity.Task;
import com.example.task.entity.TaskStatus;
import com.example.task.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final ProjectClient projectClient; // <-- Injection
    public TaskService(TaskRepository repository ,ProjectClient projectClient) {
        this.repository = repository;
        this.projectClient = projectClient;
    }

    public Task creerTache(Task task) {
        task.setStatut(TaskStatus.TODO);
        // Statut par défaut
        return repository.save(task);
    }

    public List<Task> getTachesParProjet(Long projectId) {
        return repository.findByProjectId(projectId);
    }

    public Task changerStatut(Long taskId, TaskStatus nouveauStatut) {
        Task task = repository.findById(taskId).orElseThrow();
        task.setStatut(nouveauStatut);
        return repository.save(task);
    }
}
