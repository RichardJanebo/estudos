package com.spring_direto_das_trincheiras.anime_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class Anime {

    private Long id;
    private String name;
    private Long epsodes;

    public Anime() {
    }

    private Anime(Long id, String name, Long epsodes){
        this.id = id;
        this.name = name;
        this.epsodes = epsodes;
    }

    public static class Builder {
        private Long id;
        private String name;
        private Long episodes;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder episodes(Long episodes){
            this.episodes =episodes;
            return this;
        }

        public Anime build() {
            return new Anime(id, name,episodes);
        }
    }

    @Override
    public String toString() {
        return "Anime{id=" + id + ", name='" + name + "'}";
    }

    private static List<Anime> animes = new ArrayList<>(
            List.of(new Anime.Builder().id(1L).name("Jujutsu Kaisen").episodes(396L).build(),
                    new Anime.Builder().id(2L).name("Boku no Hero").episodes(952L).build(),
                    new Anime.Builder().id(3L).name("Naruto").episodes(544L).build()));

    public List<Anime> hardcoded() {
        return animes;
    }

    public List<Anime> findByName(String name) {
        return animes.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public Anime findById(Long id) {
        return animes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Long generatedId() {
        return ThreadLocalRandom.current().nextLong(1, 500);
    }

    public Anime save(Anime anime) {
        Anime outherAnime = new Anime.Builder()
            .id(generatedId())
            .name(anime.getName())
            .episodes(anime.getEpsodes())
            .build();
        animes.add(outherAnime);
        return outherAnime;

    }

}
