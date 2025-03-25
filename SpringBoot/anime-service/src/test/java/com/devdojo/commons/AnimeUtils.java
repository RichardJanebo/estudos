package com.devdojo.commons;

import com.devdojo.domain.Anime;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class AnimeUtils {
    public List<Anime> newAnimeList() {
        return new ArrayList<>(List.of(
                new Anime.Builder().id(1L).name("Jujutsu Kaisen").build(),
                new Anime.Builder().id(2L).name("One Piece").build(),
                new Anime.Builder().id(3L).name("Attack on Titan").build(),
                new Anime.Builder().id(4L).name("Naruto").build(),
                new Anime.Builder().id(5L).name("Demon Slayer").build(),
                new Anime.Builder().id(6L).name("Death Note").build()

        ));

    }
}