package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring_direto_das_trincheiras.anime_service.domain.Anime;
import com.spring_direto_das_trincheiras.anime_service.mapper.AnimeMapper;
import com.spring_direto_das_trincheiras.anime_service.response.AnimeGetResponse;
import com.spring_direto_das_trincheiras.anime_service.response.AnimePutRequest;
import com.spring_direto_das_trincheiras.anime_service.resquest.AnimePostRequest;

import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/animes")
@Log4j2
public class AnimeController {
    private static final AnimeMapper MAPPER = AnimeMapper.INSTANCE;
    private final Anime anime = new Anime();

    @GetMapping
    public List<AnimeGetResponse> listAllAnimes() {
        log.info("Listing all animes");
        return anime.hardcoded();
    }

    @GetMapping("/search")
    public List<AnimeGetResponse> findByName(@RequestParam(required = false) String name) {
        return anime.findByName(name);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimeGetResponse> findById(@PathVariable Long id) {
        log.debug("Request to find anime by id '{}'",id);

         AnimeGetResponse animeGetResponse = anime.findById(id);
        return ResponseEntity.ok(animeGetResponse);
    }

    @PostMapping
    public AnimeGetResponse save(@RequestBody AnimePostRequest animex) {
        Anime anime02 = MAPPER.toAnime(animex);
        anime.save(anime02);
        return MAPPER.tAnimeGetResponse(anime);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        anime.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody AnimePutRequest animePutRequest){
        log.debug("Request to update anime by id {}",animePutRequest);
        anime.deleteById(animePutRequest.getId());
        anime.save(MAPPER.animePut_Anime(animePutRequest));

        return ResponseEntity.noContent().build();
    }
 
 
}
