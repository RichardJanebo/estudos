package com.devdojo.controller;


import com.devdojo.domain.Anime;
import com.devdojo.dto.dtoGetRequest.AnimeGetResponse;
import com.devdojo.dto.dtoPostRequest.AnimePostRequest;
import com.devdojo.dto.dtoPutRequest.AnimePutRequest;
import com.devdojo.mappers.animes.AnimeMapper;
import com.devdojo.service.AnimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/animes")
@Slf4j
public class AnimeController {
    private final AnimeService animeService;
    private static final AnimeMapper MAPPER = AnimeMapper.INSTANCE;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public ResponseEntity<List<AnimeGetResponse>> findAllAnimes() {
        log.info(Thread.currentThread().getName());
        List<AnimeGetResponse> listAnimeGetResponse = MAPPER.toListAnimeGetResponse(animeService.findAll());
        return ResponseEntity.ok(listAnimeGetResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimeGetResponse> findAnimeById(@PathVariable Long id) {

        AnimeGetResponse animeGetResponse = MAPPER.toAnimeGetResponse(animeService.findById(id));
        return ResponseEntity.ok(animeGetResponse);
    }

    @GetMapping("listname")
    public ResponseEntity<List<AnimeGetResponse>> listAnimesByName(@RequestParam List<String> names) {
        log.info(Thread.currentThread().getName());

        List<Anime> byName = animeService.findByName(names);

        List<AnimeGetResponse> listAnimeGetResponse = MAPPER.toListAnimeGetResponse(byName);


        return ResponseEntity.ok(listAnimeGetResponse);
    }

    @PostMapping
    public ResponseEntity<AnimeGetResponse> createAnime(@RequestBody AnimePostRequest animePostRequest) {
        Anime anime = MAPPER.toAnime(animePostRequest);

        Anime save = animeService.save(anime);

        AnimeGetResponse animeGetResponse = MAPPER.toAnimeGetResponse(save);

        return ResponseEntity.status(HttpStatus.CREATED).body(animeGetResponse);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAnimeById(@PathVariable  Long id) {
        animeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateAnime(@RequestBody AnimePutRequest animePutRequest) {
        log.info("Value do id do animePutRequest '{}'",animePutRequest.id());
        Anime anime = MAPPER.putToAnime(animePutRequest);
        log.info("id do anime Anime do maper '{}'",anime.getId());
        animeService.upadate(anime);

        return ResponseEntity.noContent().build();
    }



}
