package com.example.task.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// name: Nom du service cible (utile pour Eureka plus tard)
// url: L'adresse HTTP du service project
@FeignClient(name = "project-service", url = "http://localhost:8081")
public interface ProjectClient {

    @GetMapping("/projects/exists/{nom}")
    boolean projetExisteParNom(@PathVariable String nom);

    // Pour votre besoin spécifique (vérifier par ID), il faudrait ajouter
    // une méthode dans ProjectController pour GET /projects/exists/id/{id}
}