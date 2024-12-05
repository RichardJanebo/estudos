package com.spring_direto_das_trincheiras.anime_service.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

import lombok.Getter;


@Getter
public class Producer {

    private Long id;
    private String name;
    private LocalDateTime date;

    public Producer() {
    }

    private Producer(Long id, String name,LocalDateTime date){
        this.id = id;
        this.name = name;
        this.date =date;
        
    }

    public static class Builder {
        private Long id;
        private String name;
        private LocalDateTime date;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder date(LocalDateTime date){
            this.date = date;
            return this;
        }


      

        public Producer build() {
            return new Producer(id, name,date);
        }
    }

    @Override
    public String toString() {
        return "Anime{id=" + id + ", name='" + name + "'}";
    }

    private static List<Producer> producers = new ArrayList<>(
            List.of(new Producer.Builder().id(1L).name("Mappa").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(2L).name("Madhouse").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(3L).name("Kyoto Animation").date(LocalDateTime.now()).build()));

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

    public Producer save(ProducerPostRequest anime) {
        Producer outherProducer = new Producer.Builder()
            .id(generatedId())
            .name(anime.getName())
            .build();
        producers.add(outherProducer);
        return outherProducer;

    }

}
