package com.devdojo.service;

import com.devdojo.commons.AnimeUtils;
import com.devdojo.domain.Anime;
import com.devdojo.repository.AnimeRepository;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class AnimeServiceTest {
    private  List<Anime> ANIMES;

    @InjectMocks
    private AnimeService animeService;

    @Mock
    private AnimeRepository animeRepository;

    @InjectMocks
    private AnimeUtils animeUtils;

    @BeforeEach
    void init() {
      ANIMES = animeUtils.newAnimeList();
    }

    @Order(1)
    @DisplayName("Find all Animes and Return a List With all Animes")
    @Test
    void findAll() {
        BDDMockito.when(animeRepository.findAll()).thenReturn(ANIMES);

        var all = animeService.findAll();

        Assertions.assertThat(all).isNotNull().hasSize(6);

    }


    @Order(2)
    @DisplayName("Find Animes by name and returns a list when successful")
    @Test
    void findByName_When_Name_Exist() {
        var first = ANIMES.getFirst();
        var last = ANIMES.getLast();
        var listAnimes = List.of(first, last);

        BDDMockito.when(animeRepository.findByName(List.of(first.getName(), last.getName()))).thenReturn(listAnimes);

        var byName = animeService.findByName(List.of(first.getName(), last.getName()));

        Assertions.assertThat(byName).isNotNull().hasSize(2);
        Assertions.assertThat(byName).contains(first, last);
    }


    @Order(3)
    @DisplayName("Find Animes by name and returns a empty list when name not found")
    @Test
    void findByName_When_Name_not_found() {
        var first = ANIMES.getFirst();
        var last = ANIMES.getLast();

        BDDMockito.when(animeRepository.findByName(List.of(first.getName(), last.getName()))).thenReturn(List.of());

        var byName = animeService.findByName(List.of(first.getName(), last.getName()));

        Assertions.assertThat(byName).isNotNull();
        Assertions.assertThat(byName).isEmpty();
    }


    @Order(4)
    @DisplayName("Find Animes by Id and return a Anime when successful")
    @Test
    void findById_When_Id_Exist() {
        var first = ANIMES.getFirst();

        BDDMockito.when(animeRepository.findById(first.getId())).thenReturn(Optional.of(first));

        var byId = animeService.findById(first.getId());

        Assertions.assertThat(byId).isNotNull().extracting(Anime::getId).isEqualTo(first.getId());
        Assertions.assertThat(byId).isEqualTo(first);
    }


    @Order(5)
    @DisplayName("Find Animes by Id and return a AnimeNotFoundException when not found")
    @Test
    void findById_When_Id_Not_Found() {
        var first = ANIMES.getFirst();
        BDDMockito.when(animeRepository.findById(first.getId())).thenReturn(Optional.empty());

        Assertions.assertThatException().isThrownBy(() -> animeService.findById(first.getId()))
                .isInstanceOf(AnimeNotFoundException.class);

    }

    @Order(6)
    @DisplayName("Save anime and Return anime when successFul")
    @Test
    void save() {
        Anime anime = Anime.builder()
                .id(20L)
                .name("Test")
                .build();

        BDDMockito.when(animeRepository.save(anime)).thenReturn(anime);

        var save = animeService.save(anime);

        Assertions.assertThat(save).isNotNull().extracting(Anime::getId).isEqualTo(anime.getId());
        Assertions.assertThat(save).isEqualTo(anime);
    }


    @Order(7)
    @DisplayName("Delete Anime By Id and throw AnimeNotFoundException when id NotExist")
    @Test
    void deleteById_When_Not_Exist() {
        var first = ANIMES.getFirst();
        BDDMockito.when(animeRepository.findById(first.getId())).thenReturn(Optional.empty());


        Assertions.assertThatException().isThrownBy(() -> animeService.deleteById(first.getId()))
                .isInstanceOf(AnimeNotFoundException.class);

    }

    @Order(8)
    @DisplayName("Delete Anime By Id and delete when id Exist")
    @Test
    void deleteById_When_Exist() {
        var first = ANIMES.getFirst();
        BDDMockito.when(animeRepository.findById(first.getId())).thenReturn(Optional.of(first));
        BDDMockito.doNothing().when(animeRepository).deleteById(first);

        Assertions.assertThatNoException().isThrownBy(() -> animeService.deleteById(first.getId()));

    }


    @Order(9)
    @DisplayName("Update Anime when Exist")
    @Test
    void upadate_Anime_When_Exists() {
        Anime animeBeforeUpdating = Anime.builder()
                .id(20L)
                .name("TestBefore")
                .build();

        BDDMockito.when(animeRepository.findById(animeBeforeUpdating.getId())).thenReturn(Optional.of(animeBeforeUpdating));

        Anime animeAfterUpdating = Anime.builder()
                .id(20L)
                .name("TestAfter")
                .build();

        BDDMockito.when(animeRepository.save(animeAfterUpdating)).thenReturn(animeAfterUpdating);

        Assertions.assertThatNoException().isThrownBy(() -> animeService.upadate(animeAfterUpdating));
        BDDMockito.verify(animeRepository, BDDMockito.times(1))
                .findById(animeBeforeUpdating.getId());
        BDDMockito.verify(animeRepository, BDDMockito.times(1))
                .save(animeBeforeUpdating);
    }

    @Order(10)
    @DisplayName("Update Anime and throw AnimeNotFoundException When Anime Not Found")
    @Test
    void upadate_Anime_When_Not_Fond() {
        Anime animeBeforeUpdating = Anime.builder()
                .id(20L)
                .name("TestBefore")
                .build();

        BDDMockito.when(animeRepository.findById(animeBeforeUpdating.getId())).thenReturn(Optional.empty());


        Assertions.assertThatException().isThrownBy(() -> animeService.upadate(animeBeforeUpdating))
                .isInstanceOf(AnimeNotFoundException.class);


    }
}