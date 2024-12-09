package com.spring_direto_das_trincheiras.anime_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring_direto_das_trincheiras.anime_service.mapper.AnimeMapper;
import com.spring_direto_das_trincheiras.anime_service.response.AnimeGetResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.AnimePostRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Anime {
    private static final AnimeMapper MAPPER = AnimeMapper.INSTANCE;
    @EqualsAndHashCode.Include
    private Long id;
    @JsonProperty("name")
    private String name;
    private Long epsodes;


    public Anime() {
    }

    private Anime(Long id, String name, Long epsodes) {
        this.id = id;
        this.name = name;
        this.epsodes = epsodes;
    }

    public static class Builder {
        private Long id;
        private String name;
        private Long epsodes;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder episodes(Long episodes) {
            this.epsodes = episodes;
            return this;
        }

        public Anime build() {
            return new Anime(id, name, epsodes);
        }
    }

    @Override
    public String toString() {
        return "Anime{id=" + id + ", name='" + name + "'}";
    }

   

    public Long generatedId() {
        return ThreadLocalRandom.current().nextLong(1, 500);
    }

    

   

}
