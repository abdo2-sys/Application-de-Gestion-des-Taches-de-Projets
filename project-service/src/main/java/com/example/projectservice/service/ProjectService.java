package com.example.projectservice.service;


import com.example.projectservice.entity.Project;
import com.example.projectservice.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public Project creerProjet(Project project) {
        project.setDateCreation(LocalDate.now());
        return repository.save(project);
    }

    public boolean projetExiste(String nom) {
        return repository.existsByNom(nom);
    }

    public Project getProjet(Long id) {
        return repository.findById(id).orElse(null);
    }
}