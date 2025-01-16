package com.spring_direto_das_trincheiras.anime_service.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.spring_direto_das_trincheiras.anime_service.domain.Anime;

import lombok.Getter;
@Getter
@Component
public class AnimeData {
    public List<Anime> animes = new ArrayList<>(
            List.of(new Anime.Builder().id(1L).name("Jujutsu Kaisen").episodes(396L).build(),
                    new Anime.Builder().id(2L).name("Boku no Hero").episodes(952L).build(),
                    new Anime.Builder().id(3L).name("Naruto").episodes(544L).build()));

    
}
