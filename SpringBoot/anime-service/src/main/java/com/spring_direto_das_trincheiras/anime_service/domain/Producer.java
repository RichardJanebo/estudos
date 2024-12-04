package com.spring_direto_das_trincheiras.anime_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class Producer {

    private Long id;
    private String name;

    public Producer() {
    }

    private Producer(Long id, String name){
        this.id = id;
        this.name = name;
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

      

        public Producer build() {
            return new Producer(id, name);
        }
    }

    @Override
    public String toString() {
        return "Anime{id=" + id + ", name='" + name + "'}";
    }

    private static List<Producer> producers = new ArrayList<>(
            List.of(new Producer.Builder().id(1L).name("Mappa").build(),
                    new Producer.Builder().id(2L).name("Madhouse").build(),
                    new Producer.Builder().id(3L).name("Kyoto Animation").build()));

    public List<Producer> hardcoded() {
        return producers;
    }

    public List<Producer> findByName(String name) {
        return producers.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public Producer findById(Long id) {
        return producers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Long generatedId() {
        return ThreadLocalRandom.current().nextLong(1, 500);
    }

    public Producer save(Producer anime) {
        Producer outherProducer = new Producer.Builder()
            .id(generatedId())
            .name(anime.getName())
            .build();
        producers.add(outherProducer);
        return outherProducer;

    }

}
