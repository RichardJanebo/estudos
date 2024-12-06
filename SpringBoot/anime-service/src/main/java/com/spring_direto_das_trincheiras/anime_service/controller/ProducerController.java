package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.mapper.ProducerMapper;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/producer")
@Log4j2
public class ProducerController {
    private static final ProducerMapper MAPPER = ProducerMapper.INSTANCE;
    private final Producer producerC = new Producer();

    @GetMapping
    public List<Producer> listAllproducer() {
        log.info("Listing all producer");
        return producerC.hardcoded();
    }

    @GetMapping("/search")
    public List<Producer> findByName(@RequestParam(required = false) String name) {

        var producer = producerC.findByName(name);
        if (name == null)
            return producer;

        return producer.stream().filter(produce -> produce.getName().equalsIgnoreCase(name)).toList();
    }

    @GetMapping("/{id}")
    public Producer findById(@PathVariable Long id) {
        log.info("Finding producerby ID: {}", id);
        return producerC.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, headers = "x-api-key")
    public ResponseEntity<ProducerGetResponse> producersave(@RequestBody ProducerPostRequest producer,
            @RequestHeader HttpHeaders headers) {
        log.info("{}", headers);
        Producer producer3Producer = MAPPER.toProducer(producer);


        Producer producer2 = producerC.save(new Producer.Builder()
        .name(producer.getName())
        .build());

       
       

        ProducerGetResponse producerGetResponse = ProducerGetResponse.builder().id(producer2.getId())
        .name(producer2.getName())
        .date(producer2.getDate())
        .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(producerGetResponse);

    }
}
