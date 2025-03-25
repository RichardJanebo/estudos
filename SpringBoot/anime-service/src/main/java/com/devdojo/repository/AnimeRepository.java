package com.devdojo.repository;

import com.devdojo.domain.Anime;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Repository
public class AnimeRepository {
    private final AnimeData animeData;

    public AnimeRepository(AnimeData animeData) {
        this.animeData = animeData;
    }


    public List<Anime> findAll() {
        return animeData.getAnimes().stream().toList();
    }

    public List<Anime> findByName(List<String> names) {
        return animeData.getAnimes().stream().filter(anime -> names.contains(anime.getName())).toList();
    }

    public Optional<Anime> findById(Long id) {
        return animeData.getAnimes().stream().filter(anime -> Objects.equals(anime.getId(), id)).findFirst();
    }

    public Anime save(Anime anime) {
        animeData.getAnimes().add(anime);
        return anime;
    }

    public void deleteById(Anime anime) {
        animeData.getAnimes().remove(anime);
    }
}
