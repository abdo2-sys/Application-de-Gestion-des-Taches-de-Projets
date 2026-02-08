package com.example.task.repository;

import com.example.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Permet de lister les tâches par projet
    List<Task> findByProjectId(Long projectId);
}
