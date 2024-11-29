package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_direto_das_trincheiras.anime_service.entities.Anime;

@RestController
@RequestMapping("v1/animes")
public class AnimeController {
    @GetMapping
    public List<Anime> listAll(){
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime.Buider().name("Naruto").episodes(500).buid());
        animes.add(new Anime.Buider().name("One Piece").episodes(1000).buid());
        animes.add(new Anime.Buider().name("Attack on Titan").episodes(87).buid());
        animes.add(new Anime.Buider().name("Demon Slayer").episodes(44).buid());
        animes.add(new Anime.Buider().name("Dragon Ball Z").episodes(291).buid());
        animes.add(new Anime.Buider().name("Jujutsu Kaisen").episodes(24).buid());
        
        return animes;
    }
}

