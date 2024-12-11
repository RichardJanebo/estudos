package com.spring_direto_das_trincheiras.anime_service.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.spring_direto_das_trincheiras.anime_service.domain.Anime;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.repository.AnimeHardCodedRepository;

public class AnimeService {
    private AnimeHardCodedRepository repository;

    public AnimeService() {
        this.repository = new AnimeHardCodedRepository();
    }

    public List<Anime> findAll(String name) {
        return name == null ? repository.findAll() : repository.findByName(name);
    }

    public Anime findByIdOrThrowNotFound(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime not found"));

    }

    public void save(Anime anime) {
        repository.save(anime);
    }

    public void delete(Long id) {
        repository.deleteById(findByIdOrThrowNotFound(id));
    }

    public void update(Anime anime) {
        repository.update(anime);
    }
}
