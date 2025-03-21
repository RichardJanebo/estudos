package com.devdojo.domain;

import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Anime {
    private static final Logger log = LoggerFactory.getLogger(Anime.class);
    @EqualsAndHashCode.Include
    private Long id;
    private String name;

    private Anime(Long id, String name) {
        this.id = id;
        this.name= name;
    }

    public Long getId(){
        return  this.id;
    }

    public String getName(){
        return this.name;
    }

    public static  Builder builder(){
        return  new Builder();
    }

    public static class Builder{
        private Long id;
        private String name;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Anime build() {
            log.info("value id dentro do anime '{}'" ,this.id);
            long l =  this.id != null ? this.id : ThreadLocalRandom.current().nextLong(0, 100);
            return new Anime(l, name);
        }
    }
}
