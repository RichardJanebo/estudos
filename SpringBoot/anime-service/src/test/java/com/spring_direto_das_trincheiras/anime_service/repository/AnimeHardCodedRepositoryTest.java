package com.spring_direto_das_trincheiras.anime_service.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring_direto_das_trincheiras.anime_service.domain.Anime;

@ExtendWith(MockitoExtension.class) // Usada para gerenciar automaticamente os mocks
public class AnimeHardCodedRepositoryTest {

    private List<Anime> animes = new ArrayList<>();

    @InjectMocks
    private AnimeHardCodedRepository animeHardCodedRepository;

    @Mock
    private AnimeData animeData;

    private Optional<Anime> byId;

    @BeforeEach
    void init(){
        animes.addAll( List.of(new Anime.Builder().id(1L).name("Jujutsu Kaisen").episodes(396L).build(),
                    new Anime.Builder().id(2L).name("Boku no Hero").episodes(952L).build(),
                    new Anime.Builder().id(3L).name("Naruto").episodes(544L).build()));
    }


    @Test
    void findById_WhenSuccesFull(){
        BDDMockito.when(animeData.getAnimes()).thenReturn(animes);

        var first = animes.getFirst();
        
        var byId = animeHardCodedRepository.findById(first.getId());

        Assertions.assertThat(byId).isPresent().contains(first);
    }

}
