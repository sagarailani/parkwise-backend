package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.Client;
import com.wissen.parkwise.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{clientId}")
    public Client getClientInformation(@PathVariable int clientId) {
        return clientService.getClient(clientId);
    }

    @PostMapping
    public ResponseEntity<Client> addNewClient(@RequestBody Client client) {
        return new ResponseEntity<>(clientService.addNewClient(client), HttpStatus.CREATED);
    }

}
