package com.spring_direto_das_trincheiras.anime_service.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring_direto_das_trincheiras.anime_service.domain.Producer;

import lombok.Getter;

@Getter
@Component
public class ProducerData {
    private  List<Producer> producers = new ArrayList<>(
            List.of(new Producer.Builder().id(1L).name("Mappa").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(2L).name("Madhouse").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(3L).name("Kyoto Animation").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(6L).name("LAbamba").date(LocalDateTime.now()).build()));

    
}