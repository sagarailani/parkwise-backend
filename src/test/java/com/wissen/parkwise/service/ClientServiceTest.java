package com.wissen.parkwise.service;

import com.wissen.parkwise.model.Client;
import com.wissen.parkwise.repository.ClientDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
public class ClientServiceTest {

    @Mock
    private ClientDAO clientDAO;

    @InjectMocks
    private ClientService clientService;

    @Test
    public void getClientTest() {

        Client client = Client.builder()
                .clientId(1)
                .clientName("Sagar")
                .build();

        Optional<Client> clientOptional = Optional.of(client);
        given(clientDAO.findById(Mockito.anyInt())).willReturn(clientOptional);

        Client client1= clientService.getClient(1);

        assertThat(client1.getClientId()).isEqualTo(client.getClientId());
        assertThat(client1.getClientName()).isEqualTo(client.getClientName());

    }



}
