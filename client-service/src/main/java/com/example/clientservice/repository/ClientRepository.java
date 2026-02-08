package com.example.clientservice.repository;

import com.example.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // Méthode personnalisée si besoin
}
