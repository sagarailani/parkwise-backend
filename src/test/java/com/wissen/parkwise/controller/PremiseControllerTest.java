package com.wissen.parkwise.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wissen.parkwise.model.Client;
import com.wissen.parkwise.model.Premise;
import com.wissen.parkwise.model.User;
import com.wissen.parkwise.service.ClientService;
import com.wissen.parkwise.service.PremiseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(PremiseController.class)
public class PremiseControllerTest {

    @MockBean
    private PremiseService premiseService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addNewManagerTest() throws Exception {

        User user = User.builder()
                .userId(1)
                .client(Client.builder()
                        .clientName("Sagar")
                        .clientId(1)
                        .build())
                .username("manager")
                .password("manager")
                .premise(Premise.builder()
                        .premiseId(1)
                        .premiseName("Phoenix")
                        .client(Client.builder()
                            .clientName("Sagar")
                            .clientId(1)
                            .build())
                        .build())
                .build();

        given(premiseService.createNewManager(Mockito.any(User.class))).willReturn(user);

        this.mockMvc.perform(post("/client/1/premise/1/manager")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(new ObjectMapper().writeValueAsBytes(user))
                        .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.client.clientId", is(2)));
    }



}
