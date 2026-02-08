package com.example.clientservice.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "clients")
@Getter
@Setter
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nom;

    @Column(unique = true, nullable = false)
    private String email;

    private String telephone;

    private LocalDate dateCreation;

    // Constructeurs, Getters, Setters
}