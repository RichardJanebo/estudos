package com.devdojo.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@ToString
public class Producer {
    private static final Logger log = LoggerFactory.getLogger(Producer.class);
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private LocalDateTime dateTime;

    private Producer(Long id, String name, LocalDateTime localDateTime) {
        this.id = id;
        this.name = name;
        this.dateTime = localDateTime;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDateTime getLocalDateTime() {
        return this.dateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private LocalDateTime dateTime;

        public Builder id(Long id){
            this.id =id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dateTime(LocalDateTime dateTime){
            this.dateTime = dateTime;
            return this;
        }



        public Producer build() {
            log.info("value id '{}'", this.id);
            log.info("Value date '{}'" ,this.dateTime);
            long l = this.id != null ? this.id :ThreadLocalRandom.current().nextLong(0, 100);
            LocalDateTime localDateTime = this.dateTime != null ? this.dateTime : LocalDateTime.now();
            return new Producer(l, name, localDateTime);
        }
    }
}
