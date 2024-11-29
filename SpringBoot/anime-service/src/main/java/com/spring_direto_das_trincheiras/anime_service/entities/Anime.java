package com.spring_direto_das_trincheiras.anime_service.entities;

import java.util.UUID;

public class Anime {
    private String id;
    private String name;
    private Integer episodes;

    private Anime(String name, Integer epsodes) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.episodes = epsodes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public static class Buider {
        private String name;
        private Integer episodes;

        public Buider name(String name) {
            this.name = name;
            return this;
        }

        public Buider episodes(Integer episodes) {
            this.episodes = episodes;
            return this;
        }

        public Anime buid() {
            return new Anime(name, episodes);
        }
    }

}
