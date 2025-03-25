package com.devdojo.repository;

import com.devdojo.domain.Producer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Repository
public class ProducerRepository {
    private final ProducerData producerData;

    public ProducerRepository(ProducerData producerData) {
        this.producerData = producerData;
    }


    public List<Producer> findAll() {
        return producerData.getProducers().stream().toList();
    }

    public List<Producer> findByName(List<String> names) {
        return producerData.getProducers().stream().filter(Producer -> names.contains(Producer.getName())).toList();
    }

    public Optional<Producer> findById(Long id) {
        return producerData.getProducers().stream().filter(Producer -> Objects.equals(Producer.getId(), id)).findFirst();
    }

    public Producer save(Producer producer) {

        producerData.getProducers().add(producer);
        return producer;
    }

    public void delete(Producer producer) {
        producerData.getProducers().remove(producer);
    }
}
