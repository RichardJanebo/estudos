package com.devdojo.service;

import com.devdojo.domain.Producer;
import com.devdojo.repository.ProducerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProducerService {
    private static final Logger log = LoggerFactory.getLogger(ProducerService.class);
    private final ProducerRepository producerRepository;

    public ProducerService(ProducerRepository ProducerRepository) {
        this.producerRepository = ProducerRepository;
    }

    public List<Producer> findAll() {
        return producerRepository.findAll();
    }

    public List<Producer> findByName(List<String> name) {
        return producerRepository.findByName(name);
    }

    public Producer findById(Long id) {
        return producerRepository.findById(id).orElseThrow(() -> new ProducerNotFoundException("Producer não encontrado"));
    }

    public Producer save(Producer producer) {

        return producerRepository.save(producer);
    }

    public void deleteById(Long id) {

        Producer byId = findById(id);
        producerRepository.delete(byId);
    }

    public void upadate(Producer producer) {
        Producer byId = findById(producer.getId());


        Producer upadate = Producer.builder()
                .id(producer.getId())
                .name(producer.getName())
                .dateTime(byId.getLocalDateTime())
                .build();

        deleteById(producer.getId());

        save(upadate);
    }
}

class ProducerNotFoundException extends ResponseStatusException {
    public ProducerNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND);
    }
}

