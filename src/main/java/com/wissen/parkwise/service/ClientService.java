package com.wissen.parkwise.service;

import com.wissen.parkwise.model.Client;
import com.wissen.parkwise.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientDAO clientDAO;

    public Client getClient(int clientId) {
        return clientDAO.findById(clientId).get();
    }

    public Client addNewClient(Client client) {
        clientDAO.save(client);
        return client;
    }
}
