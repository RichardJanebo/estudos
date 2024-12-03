package com.spring_direto_das_trincheiras.anime_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Anime {

    private Long id;
    private String name;

    public Anime() {
    }

    public static class Builder {
        private Long id;
        private String name;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Anime build() {
            return new Anime(id, name);
        }
    }

    @Override
    public String toString() {
        return "Anime{id=" + id + ", name='" + name + "'}";
    }

    private static List<Anime> anime = new ArrayList<>(
            List.of(new Anime.Builder().id(1L).name("Jujutsu Kaisen").build(),
                    new Anime.Builder().id(2L).name("Boku no Hero").build(),
                    new Anime.Builder().id(3L).name("Naruto").build()));

    public List<Anime> hardcoded() {
        return anime;
    }

    public List<Anime> findByName(String name) {
        return anime.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public Anime findById(Long id) {
        return anime.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Long generatedId() {
        return ThreadLocalRandom.current().nextLong(1, 500);
    }

    // public Anime save(Anime anime) {
    //     Anime outherAnime = new Anime.Builder()
    //         .id = generatedId()

    // }

}
