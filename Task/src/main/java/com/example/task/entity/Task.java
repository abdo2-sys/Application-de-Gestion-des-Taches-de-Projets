package com.example.task.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Référence logique vers le Project Service
    private Long projectId;

    private String titre;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus statut; // Enum à créer

    private String responsable;

    // Getters, Setters, Constructeurs
}