package com.spring_direto_das_trincheiras.anime_service.controller;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import lombok.var;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("v1/producer")
@Log4j2
public class ProducerController {
    private final Producer producer = new Producer();

    @GetMapping
    public List<Producer> listAllproducer() {
        log.info("Listing all producer");
        return producer.hardcoded(); 
    }

    @GetMapping("/search")
    public List<Producer> findByName(@RequestParam (required = false) String name){
        
        var producer = producer.findByName(name);
        if(name == null) return producer;

      return  producer.stream().filter(produce -> produce.getName().equalsIgnoreCase(name)).toList();
    }


    @GetMapping("/{id}")
    public Producer findById(@PathVariable Long id) {
        log.info("Finding producerby ID: {}", id);
        return producer.findById(id); 
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE,headers = "x-api-key=1234")
    public Producer producersave(@RequestBody Producer producer ){
       return producer.save(producer);
    }
}
