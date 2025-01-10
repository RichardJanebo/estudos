package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.mapper.ProducerMapper;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerPutResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;
import com.spring_direto_das_trincheiras.anime_service.service.ProducerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/producer")
@Log4j2
@RequiredArgsConstructor
public class ProducerController {
    private  final ProducerMapper PRODUCER_MAPPER;
    private final ProducerService producerService;


    @GetMapping
    public List<ProducerGetResponse> listAllproducer() {
        log.info("Listing all producer");

        return PRODUCER_MAPPER.toListProducerGetResponses(producerService.findAll());

    }

    @GetMapping("/search")
    public List<ProducerGetResponse> findByName(@RequestParam(required = false) String name) {
       return PRODUCER_MAPPER.toListProducerGetResponses(producerService.findByName(name));
    }

    @GetMapping("/{id}")
    public ProducerGetResponse findById(@PathVariable Long id) {
        log.info("Finding producerby ID: {}", id);
        return PRODUCER_MAPPER.toProducerGetResponse(producerService.findById(id)) ;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, headers = "x-api-key")
    public ResponseEntity<ProducerGetResponse> producersave(@RequestBody ProducerPostRequest producer,
            @RequestHeader HttpHeaders headers) {
        log.info("{}", headers);
        Producer producer3Producer = PRODUCER_MAPPER.toProducer(producer);

        ProducerGetResponse response = PRODUCER_MAPPER.toProducerGetResponse(producerService.save(producer3Producer));

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        producerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateProducer(@RequestBody ProducerPutResponse producerPutResponse) {
        producerService.update(PRODUCER_MAPPER.putProducer_Producer(producerPutResponse));

        return ResponseEntity.noContent().build();
    }
}
