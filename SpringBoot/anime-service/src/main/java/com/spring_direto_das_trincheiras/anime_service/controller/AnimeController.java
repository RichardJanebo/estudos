package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.spring_direto_das_trincheiras.anime_service.service.AnimeService;

import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/animes")
@CrossOrigin(origins = "http://127.0.0.1:5500")
@Log4j2
public class AnimeController {
    private static final AnimeMapper MAPPER = AnimeMapper.INSTANCE;
    private final AnimeService animeService = new AnimeService();


    @GetMapping
    public ResponseEntity<List<AnimeGetResponse>> listAllAnimes(String name) {
        log.info("Listing all animes");
        List<AnimeGetResponse> listAnimeToListAnimeGetResponse = MAPPER
                .listAnimeToListAnimeGetResponse(animeService.findAll(null));
        return ResponseEntity.ok(listAnimeToListAnimeGetResponse);
    }
    

    @GetMapping("/search")
    public ResponseEntity<List<AnimeGetResponse>> findByName(@RequestParam(required = false) String name) {
        List<AnimeGetResponse> listAnimeToListAnimeGetResponse = MAPPER
                .listAnimeToListAnimeGetResponse(animeService.findAll(name));
        return ResponseEntity.ok(listAnimeToListAnimeGetResponse);
    }


    @GetMapping("/{id}")
    public ResponseEntity<AnimeGetResponse> findById(@PathVariable Long id) {
        log.debug("Request to find anime by id '{}'", id);

        AnimeGetResponse animeGetResponse = MAPPER.tAnimeGetResponse(animeService.findByIdOrThrowNotFound(id));
        return ResponseEntity.ok(animeGetResponse);
    }


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AnimePostRequest animex) {
        Anime anime02 = MAPPER.toAnime(animex);
        animeService.save(anime02);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        animeService.delete(id);

        return ResponseEntity.noContent().build();
    }


    @PutMapping
    public ResponseEntity<Void> update(@RequestBody AnimePutRequest animePutRequest) {
        log.debug("Request to update anime by id {}", animePutRequest);

        animeService.update(MAPPER.animePut_Anime(animePutRequest));

        return ResponseEntity.noContent().build();
    }

}
