package com.spring_direto_das_trincheiras.anime_service.repository;

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
    private final ProducerData producers;
    private final Connection connection;

    public List<Producer> findAll() {
        return producers.getProducers();
    }

    public Optional<Producer> findById(Long id) {
        return producers.getProducers().stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    public List<Producer> findByName(String name) {
        return producers.getProducers().stream()
                .filter(e -> e.getName().equals(name))
                .toList();
    }

    public Producer save(Producer producer) {
        producers.getProducers().add(producer);
        return producer;
    }

    public void delete(Producer producer) {
        producers.getProducers().remove(producer);
    }

    public void update(Producer producer) {
        delete(producer);
        save(producer);
    }

}
