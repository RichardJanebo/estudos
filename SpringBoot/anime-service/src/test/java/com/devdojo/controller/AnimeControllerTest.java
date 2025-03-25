package com.devdojo.controller;

import com.devdojo.commons.AnimeUtils;
import com.devdojo.commons.FindMatchResources;
import com.devdojo.domain.Anime;
import com.devdojo.repository.AnimeData;
import com.devdojo.repository.AnimeRepository;

import com.devdojo.service.AnimeService;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@WebMvcTest(controllers = AnimeController.class)
@ComponentScan(basePackages = "com.devdojo")
class AnimeControllerTest {
    private List<Anime> ANIMES;
    private static final String URL = "/v1/animes";

    @Autowired
    private FindMatchResources findMatchResources;

    @Autowired
    private AnimeController animeController;

    @SpyBean
    private AnimeRepository animeRepository;

    @Autowired
    private AnimeUtils animeUtils;

    @MockBean
    private AnimeData animeData;

    @Autowired
    private MockMvc mockMvc;


    @BeforeEach
    void init() {
        ANIMES = animeUtils.newAnimeList();
    }



    @Order(1)
    @DisplayName("GET v1/animes return a list with all Animes")
    @Test
    void findAll() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var animes = findMatchResources.readResourceFile("animes/get-animes-200.json");

        mockMvc.perform(MockMvcRequestBuilders.get(URL))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(animes));
    }

    @Order(2)
    @DisplayName("GET v1/animes?names=Attack on Titan,Naruto returns a list when successful")
    @Test
    void findByName_When_Name_Exist() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var animes = findMatchResources.readResourceFile("animes/get-animes-byname-200.json");

        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/listname").param("names", "Attack on Titan,Naruto"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(animes));
    }


    @Order(3)
    @DisplayName("GET v1/animes?name=X returns a empty list when name not found")
    @Test
    void findByName_When_Name_not_found() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var animes = findMatchResources.readResourceFile("animes/get-animes-byname-x-200.json");

        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/listname")
                        .param("names", "X"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(animes));
    }


    @Order(4)
    @DisplayName("GET v1/animes/1  return a Anime when successful")
    @Test
    void findById_When_Id_Exist() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var animes = findMatchResources.readResourceFile("animes/get-animes-byId-200.json");

        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(animes));
    }

    @Order(5)
    @DisplayName("GET v1/animes/99 return a AnimeNotFoundException when not found")
    @Test
    void findById_When_Anime_Not_Found() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "/99"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());

    }

    @Order(6)
    @DisplayName("POST v1/animes Save anime and Return anime when successFul")
    @Test
    void save() throws Exception {
        var request = findMatchResources.readResourceFile("animes/post-request-anime-200.json");
        var result = findMatchResources.readResourceFile("animes/post-result-anime-200.json");
        var nameTest = Anime.builder().id(20L).name("TestName").build();


        BDDMockito.when(animeRepository.save(ArgumentMatchers.any())).thenReturn(nameTest);


        mockMvc.perform(MockMvcRequestBuilders
                        .post(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().json(result));
    }

    @Order(7)
    @DisplayName("PUT v1/animes Update Anime when Exist")
    @Test
    void upadate_Anime_When_Exists() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var request = findMatchResources.readResourceFile("animes/put-request-anime-200.json");

        mockMvc.perform(MockMvcRequestBuilders
                        .put(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNoContent());


    }

    @Order(8)
    @DisplayName("PUT v1/animes and throw AnimeNotFoundException When Anime Not Found")
    @Test
    void upadate_Anime_When_Not_Fond() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var request = findMatchResources.readResourceFile("animes/put-request-anime-IdX-200.json");

        mockMvc.perform(MockMvcRequestBuilders
                        .put(URL)
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());


    }


    @Order(9)
    @DisplayName("DELETE v1/animes nd delete when id Exist")
    @Test
    void deleteById_When_Exist() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        mockMvc.perform(MockMvcRequestBuilders
                        .delete(URL + "/1")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNoContent());

    }

    @Order(10)
    @DisplayName("DELETE v1/animes and throw AnimeNotFoundException when id NotExist")
    @Test
    void deleteById_When_Not_Exist() throws Exception {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        mockMvc.perform(MockMvcRequestBuilders
                        .delete(URL + "/99")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }


}