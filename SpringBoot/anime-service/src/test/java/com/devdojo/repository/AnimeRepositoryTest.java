package com.devdojo.repository;

import com.devdojo.domain.Anime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class AnimeRepositoryTest {
    private final List<Anime> ANIMES = new ArrayList<>();

    @InjectMocks
    private AnimeRepository animeRepository;

    @Mock
    private AnimeData animeData;

    @BeforeEach
    void init() {
        ANIMES.addAll(List.of(
                new Anime.Builder().name("Jujutsu Kaisen").build(),
                new Anime.Builder().name("One Piece").build(),
                new Anime.Builder().name("Attack on Titan").build(),
                new Anime.Builder().name("Naruto").build(),
                new Anime.Builder().name("Demon Slayer").build(),
                new Anime.Builder().name("Death Note").build()
        ));
    }


    @DisplayName("Find all Animes When successFul")
    @Order(1)
    @Test
    void findAll() {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);

        var all = animeRepository.findAll();

        Assertions.assertThat(all).hasSize(ANIMES.size());

    }

    @DisplayName("Find Anime By Name And Return Anime When SuccessFul")
    @Order(2)
    @Test
    void findByName() {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);

        var expectedFirstAnime = ANIMES.getFirst();
        var expecetdLastAnime = ANIMES.getLast();
        var listAnimes = List.of(expecetdLastAnime.getName(), expectedFirstAnime.getName());

        var byName = animeRepository.findByName(listAnimes);

        Assertions.assertThat(byName).contains(expecetdLastAnime,expectedFirstAnime);
        Assertions.assertThat(byName).isNotEmpty().hasSize(2);

    }


    @DisplayName("Find Anime By Id and Return Anime When SuccessFul")
    @Order(3)
    @Test
    void findById() {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);

        var expectedFirstAnime = ANIMES.getFirst();

        var byId = animeRepository.findById(expectedFirstAnime.getId()).orElse(null);

        Assertions.assertThat(byId).isNotNull().isEqualTo(expectedFirstAnime);
        Assertions.assertThat(byId.getId()).isEqualTo(expectedFirstAnime.getId());
    }


    @DisplayName("Save anime When SuccessFul")
    @Order(4)
    @Test
    void save() {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var allBefore = animeRepository.findAll();

        Assertions.assertThat(allBefore).isNotNull().hasSize(6);

        Anime updatedAnime = Anime.builder()
                .id(20L)
                .name("Test")
                .build();

        animeRepository.save(updatedAnime);

        var allAfter = animeRepository.findAll();
        Assertions.assertThat(allAfter).isNotNull().hasSize(7);
        Assertions.assertThat(allAfter).contains(updatedAnime);

    }


    @DisplayName("Delete Anime When SuccessFul")
    @Order(5)
    @Test
    void deleteById() {
        BDDMockito.when(animeData.getAnimes()).thenReturn(ANIMES);
        var allBefore = animeRepository.findAll();

        Assertions.assertThat(allBefore).isNotNull().hasSize(6);

        var expectedFirstAnime = ANIMES.getFirst();

        animeRepository.deleteById(expectedFirstAnime);

        var allAfter = animeRepository.findAll();

        Assertions.assertThat(allAfter).isNotNull().hasSize(5);
        Assertions.assertThat(allAfter).doesNotContain(expectedFirstAnime);


    }
}