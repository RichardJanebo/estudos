package com.devdojo.controller;

import com.devdojo.dto.dtoGetRequest.ProducerGetResponse;
import com.devdojo.dto.dtoPostRequest.ProducerPostRequest;
import com.devdojo.dto.dtoPutRequest.ProducerPutRequest;

import com.devdojo.mappers.producers.ProducerMapper;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.devdojo.service.ProducerService;
import com.devdojo.domain.Producer;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@RestController
@RequestMapping("v1/producers")
@Slf4j
public class ProducerController {
    private final ProducerService producerService;
    private static final ProducerMapper MAPPER = ProducerMapper.INSTANCE;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }


    @GetMapping
    public ResponseEntity<List<ProducerGetResponse>> findAllProducers() {
        log.info(Thread.currentThread().getName());
        List<ProducerGetResponse> listProducerGetResponse = MAPPER.toListProducerGetResponse(producerService.findAll());
        return ResponseEntity.ok(listProducerGetResponse);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProducerGetResponse> findProducerById(@PathVariable Long id) {


        return ResponseEntity.ok(MAPPER.toProducerGetResponse(producerService.findById(id)));


    }


    @GetMapping("listname")
    public ResponseEntity<List<ProducerGetResponse>> listProducersByName(@RequestParam List<String> names) {
        log.info(Thread.currentThread().getName());
        return ResponseEntity.ok(MAPPER.toListProducerGetResponse(producerService.findByName(names)));
    }


    @PostMapping
    public ResponseEntity<ProducerGetResponse> createProducer(@RequestBody ProducerPostRequest postRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add("Authorization ", "My-key");

        Producer producer = MAPPER.toProducer(postRequest);

        Producer save = producerService.save(producer);

        ProducerGetResponse producerGetResponse = MAPPER.toProducerGetResponse(save);

        return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(producerGetResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProducerById(@PathVariable Long id) {
        producerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody ProducerPutRequest producerPutRequest) {


        Producer producer = MAPPER.putToProducer(producerPutRequest);

        producerService.upadate(producer);
        return ResponseEntity.noContent().build();

    }

}
