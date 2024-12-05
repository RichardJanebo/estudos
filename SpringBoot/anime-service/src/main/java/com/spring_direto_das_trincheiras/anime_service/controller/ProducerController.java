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
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/producer")
@Log4j2
public class ProducerController {
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

    // @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, headers = "x-api-key")
    // public ResponseEntity<ProducerGetResponse> producersave(@RequestBody ProducerPostRequest producer,
    //         @RequestHeader HttpHeaders headers) {
    //     log.info("{}", headers);
    //     producerC.save(producer);
       

    //     ProducerGetResponse.builder().id(producer.getId())
    //     .name(producer.getName())
    //     .date(producer.)
    //     return ResponseEntity.;

    // }
}
