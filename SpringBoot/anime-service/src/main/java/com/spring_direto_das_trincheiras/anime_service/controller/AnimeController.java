package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_direto_das_trincheiras.anime_service.domain.Anime;

import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/animes")
@Log4j2
public class AnimeController {
    private final Anime anime = new Anime();

    @GetMapping
    public List<Anime> listAllAnimes() {
        log.info("Listing all animes");
        return anime.hardcoded(); 
    }

    @GetMapping("/search")
    public List<Anime> findByName(@RequestParam (required = false) String name){
        
        var animes = anime.findByName(name);
        if(name == null) return animes;

      return  animes.stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }


    @GetMapping("/{id}")
    public Anime findById(@PathVariable Long id) {
        log.info("Finding anime by ID: {}", id);
        return anime.findById(id); 
    }

    // @PostMapping
    // public Anime save(@RequestBody Anime anime){

    // }
}
