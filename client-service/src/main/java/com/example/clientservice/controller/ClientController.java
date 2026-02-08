package com.example.clientservice.controller;


import com.example.clientservice.entity.Client;
import com.example.clientservice.service.ClientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return service.creerClient(client);
    }

    @GetMapping
    public List<Client> getAll() {
        return service.listerClients();
    }
}