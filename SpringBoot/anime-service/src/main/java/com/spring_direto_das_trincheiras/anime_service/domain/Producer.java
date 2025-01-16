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
import lombok.Setter;


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

   

  


}
