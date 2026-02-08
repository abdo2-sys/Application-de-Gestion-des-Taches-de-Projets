package com.example.clientservice.service;


import com.example.clientservice.entity.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client creerClient(Client client) {
        client.setDateCreation(LocalDate.now());
        return repository.save(client);
    }

    public List<Client> listerClients() {
        return repository.findAll();
    }
}