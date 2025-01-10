package com.spring_direto_das_trincheiras.anime_service.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;

import external.depemdency.Connection;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ProducerRepository {

    private final Connection connection;

    private static List<Producer> producers = new ArrayList<>(
            List.of(new Producer.Builder().id(1L).name("Mappa").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(2L).name("Madhouse").date(LocalDateTime.now()).build(),
                    new Producer.Builder().id(3L).name("Kyoto Animation").date(LocalDateTime.now()).build()));


    

    public List<Producer> findAll(){
        return producers;
    }

    
    public Optional<Producer> findById(Long id) {
        return producers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    public List<Producer> findByName(String name){
        return producers.stream()
            .filter(e -> e.getName().equals(name))
            .toList();
    }


    public Producer save(Producer producer){
        producers.add(producer);
        return producer;
    }

    public void delete(Producer producer){
        producers.remove(producer);
    }

    public void update(Producer producer){
        delete(producer);
        save(producer);
    }




}
