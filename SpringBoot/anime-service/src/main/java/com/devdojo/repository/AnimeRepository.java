package com.devdojo.repository;

import com.devdojo.domain.Anime;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.PanelUI;
import java.util.*;


@Repository
public class AnimeRepository {
    private final AnimeData animeData;

    public AnimeRepository(AnimeData animeData) {
        this.animeData = animeData;
    }


    public List<Anime> findAll() {
        return animeData.getAnimes().stream().sorted(Comparator.comparing(Anime::getName).reversed()).toList();
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
