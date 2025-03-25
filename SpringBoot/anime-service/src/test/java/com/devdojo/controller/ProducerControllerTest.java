package com.devdojo.controller;


import com.devdojo.commons.FindMatchResources;
import com.devdojo.commons.ProducerUtils;
import com.devdojo.domain.Producer;
import com.devdojo.repository.ProducerData;
import com.devdojo.repository.ProducerRepository;
import com.devdojo.service.ProducerService;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@WebMvcTest(controllers = ProducerController.class)
@ComponentScan(basePackages = "com.devdojo")
class ProducerControllerTest {
    private static final String URL = "/v1/producers";
    private  List<Producer> PRODUCER;
    @Autowired
    private ResourceLoader resourceLoader;
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private FindMatchResources findMatchResources;

    @Autowired
    private ProducerUtils utils;

    @SpyBean
    private ProducerRepository producerRepository;

    @MockBean
    private ProducerData producerData;



    @BeforeEach
    void init() {
        PRODUCER = utils.newProducerList();
    }


    @Order(1)
    @DisplayName("GET v1/producers Find all returns a list with all Producers")
    @Test
    void findAll() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var response = findMatchResources.readResourceFile("producer/get-producer-200.json");
        mockMvc.perform(MockMvcRequestBuilders.get(URL))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(response));
    }


    @Order(2)
    @DisplayName("GET v1/producers?name=MAPPA,Trigger")
    @Test
    void findByName_When_SuccessFull() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var response = findMatchResources.readResourceFile("producer/get_producer-byname-200.json");
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/listname?names=MAPPA,Trigger"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(response));

    }

    @Order(3)
    @DisplayName("GET v1/producers?name=X")
    @Test
    void findByName_When_Name_Not_Found() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var response = findMatchResources.readResourceFile("producer/get_producer-byname-X-200.json");
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/listname").param("names", "X"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(response));

    }


    @Order(4)
    @DisplayName("GET V1/Producers Find producer By Id and return Producer when successful")
    @Test
    void findById_When_Id_Exist() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var response = findMatchResources.readResourceFile("producer/get-producer-byId-1-200.json");
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(response));
    }


    @Order(5)
    @DisplayName("GET v1/producers/99 Find producer By Id and Throw 400  ProducerNotFoundException when not Found")
    @Test
    void findById_When_Producer_Not_Found() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/99"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Order(6)
    @DisplayName("POST v1/producers Save Producer")
    @Test
    void save() throws Exception {
        var request = findMatchResources.readResourceFile("producer/post-request-producer-200.json");
        var response = findMatchResources.readResourceFile("producer/post-response-producer-201.json");
        var nameTest = Producer.builder().id(20L).name("TestName").build();

        BDDMockito.when(producerRepository.save(ArgumentMatchers.any())).thenReturn(nameTest);
        mockMvc.perform(MockMvcRequestBuilders
                        .post(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().json(response));


    }

    @Order(7)
    @DisplayName("PUT v1/producers update Producer When SuccessFul")
    @Test
    void update() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var request = findMatchResources.readResourceFile("producer/put-request-producer-200.json");
        mockMvc.perform(MockMvcRequestBuilders
                        .put(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNoContent());


    }

    @Order(8)
    @DisplayName("PUT v1/producers update Producer and Throw ProducerNotFoundException when Producer Not Found")
    @Test
    void update_Producer_When_User_Not_Found() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        var request = findMatchResources.readResourceFile("producer/put-request-producer-IdX-200.json");

        mockMvc.perform(MockMvcRequestBuilders
                        .put(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }


    @Order(9)
    @DisplayName("DELETE v1/producers/1 remove Producer When SuccessFul")
    @Test
    void deleteById_When_SuccessFul() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);
        mockMvc.perform(MockMvcRequestBuilders.delete(URL + "/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNoContent());

    }


    @Order(10)
    @DisplayName("DELETE v1/producers/99 Delete Producer and throw ProducerNotFoundException when not found")
    @Test
    void deleteById_When_Producer_NotFound() throws Exception {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        mockMvc.perform(MockMvcRequestBuilders.delete(URL + "/99"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());

    }


}