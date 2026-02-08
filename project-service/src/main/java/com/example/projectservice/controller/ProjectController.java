package com.example.projectservice.controller;

import com.example.projectservice.entity.Project;
import com.example.projectservice.service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @PostMapping
    public Project creerProjet(@RequestBody Project project) {
        return service.creerProjet(project);
    }

    @GetMapping("/exists/{nom}")
    public boolean exists(@PathVariable String nom) {
        return service.projetExiste(nom);
    }

    @GetMapping("/{id}")
    public Project getProjet(@PathVariable Long id) {
        return service.getProjet(id);
    }
}
