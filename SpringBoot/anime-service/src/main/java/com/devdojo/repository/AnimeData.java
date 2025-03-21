package com.devdojo.repository;

import com.devdojo.domain.Anime;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class AnimeData {
    private  List<Anime> ANIMES = new ArrayList<>(List.of(
            new Anime.Builder().name("Jujutsu Kaisen").build(),
            new Anime.Builder().name("One Piece").build(),
            new Anime.Builder().name("Attack on Titan").build(),
            new Anime.Builder().name("Naruto").build(),
            new Anime.Builder().name("Demon Slayer").build(),
            new Anime.Builder().name("Death Note").build()
    ));


    public List<Anime> getAnimes(){
        return ANIMES;
    }
}
