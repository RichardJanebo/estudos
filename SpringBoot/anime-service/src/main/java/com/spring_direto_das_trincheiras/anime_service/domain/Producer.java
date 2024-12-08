package com.spring_direto_das_trincheiras.anime_service.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring_direto_das_trincheiras.anime_service.mapper.ProducerMapper;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producer {
    @EqualsAndHashCode.Include
    private Long id;
    @JsonProperty("name")
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
        private LocalDateTime date; ;

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

    private static final ProducerMapper MAPPER = ProducerMapper.INSTANCE;
    private static List<Producer> producers = new ArrayList<>(
            List.of(new Producer.Builder().id(1L).name("Mappa").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(2L).name("Madhouse").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(3L).name("Kyoto Animation").date(LocalDateTime.now()).build()));

    public List<ProducerGetResponse> hardcoded() {
        return producers.stream().map(MAPPER::toProducerGetResponse).collect(Collectors.toList());
    }

    public List<ProducerGetResponse> findByName(String name) {
        return producers.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .map(MAPPER::toProducerGetResponse)
                .collect(Collectors.toList());
    }

    public ProducerGetResponse findById(Long id) {
        return producers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .map(MAPPER::toProducerGetResponse)
                .orElseThrow(() ->  new ResponseStatusException(HttpStatus.NOT_FOUND,"Producer not Found"));
    }

    public Long generatedId() {
        return ThreadLocalRandom.current().nextLong(1, 500);
    }

    public Producer save(Producer producer) {
        producers.add(producer);
        return producer;
    }

    public void deleteById(Long id){
        boolean foud = false;
        for (int i = 0; i < producers.size(); i++) {
            if(producers.get(i).getId().equals(id)){
                foud = true;
                producers.remove(i);
            }
        }

        if(!foud){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Producer not Found");
        }

    }

}
