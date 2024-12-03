package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("v1/greetings")
public class HelloController {
    private String name;


    @GetMapping
    public String getNome(){
        return Optional.ofNullable(name)
            .orElseThrow(()-> new RuntimeException("Nome nulo"));
    }

    @PostMapping
    public void save(@RequestBody String name){
        this.name = name;
        log.info("Noma salvo '{}'",name);
    }

    
}