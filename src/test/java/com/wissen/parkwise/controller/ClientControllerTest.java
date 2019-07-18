package com.wissen.parkwise.controller;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wissen.parkwise.model.Client;
import com.wissen.parkwise.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ClientController.class)
public class ClientControllerTest {

    @MockBean
    ClientService clientService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getClientInformationTest() throws Exception {

        Client client = Client.builder()
                .clientId(1)
                .clientName("Ailani")
                .build();

        given(clientService.getClient(1)).willReturn(client);

        System.out.println(client.toString());

        this.mockMvc.perform(get("/client/1"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'clientId': 1, 'clientName': 'Ailani'}"));

    }

    @Test
    public void addNewClientTest() throws Exception {

        Client client = Client.builder()
                .clientId(1)
                .clientName("Ailani")
//                .creationDate(LocalDateTime.now())
                .build();


        given(clientService.addNewClient(Mockito.any(Client.class))).willReturn(client);

        this.mockMvc.perform(post("/client")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .content(new ObjectMapper().writeValueAsBytes(client))
                    .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isCreated())
                .andExpect(content().json("{'clientId': 1, 'clientName': 'Ailani'}"));
    }

}
