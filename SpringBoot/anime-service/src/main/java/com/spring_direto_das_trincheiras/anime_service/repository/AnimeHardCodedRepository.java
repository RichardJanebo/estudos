package com.spring_direto_das_trincheiras.anime_service.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.spring_direto_das_trincheiras.anime_service.domain.Anime;
@Repository
public class AnimeHardCodedRepository {
    public static List<Anime> animes = new ArrayList<>(
            List.of(new Anime.Builder().id(1L).name("Jujutsu Kaisen").episodes(396L).build(),
                    new Anime.Builder().id(2L).name("Boku no Hero").episodes(952L).build(),
                    new Anime.Builder().id(3L).name("Naruto").episodes(544L).build()));

    public  List<Anime> findAll() {
        return animes;
    }

    public Optional<Anime> findById(Long id) {
        return animes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();

    }

    public List<Anime> findByName(String name) {
        return animes.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .toList();

    }

    public Anime save(Anime anime) {
        animes.add(anime);
        return anime;
    }

    public void deleteById(Anime anime){
         animes.remove(anime);
    }



    public void update(Anime anime){
        deleteById(anime);
        save(anime);
    }

}
