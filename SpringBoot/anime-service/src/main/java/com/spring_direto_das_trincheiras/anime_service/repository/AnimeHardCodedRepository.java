package com.spring_direto_das_trincheiras.anime_service.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.spring_direto_das_trincheiras.anime_service.domain.Anime;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class AnimeHardCodedRepository {
   private final AnimeData animes;


    public  List<Anime> findAll() {
        return animes.getAnimes();
    }

    public Optional<Anime> findById(Long id) {
        return animes.getAnimes().stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();

    }

    public List<Anime> findByName(String name) {
        return animes.getAnimes().stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .toList();

    }

    public Anime save(Anime anime) {
        animes.getAnimes().add(anime);
        return anime;
    }

    public void deleteById(Anime anime){
         animes.getAnimes().remove(anime);
    }



    public void update(Anime anime){
        deleteById(anime);
        save(anime);
    }

}
