package com.spring_direto_das_trincheiras.anime_service.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/heroes")
public class HeroController {
    private static final List<String> HEROES = List.of("Guts", "Zoro", "Kakashi", "Goku");

    @GetMapping
    public List<String> listAllHeros() {
        return HEROES;
    }

    @GetMapping("filter")
    public List<String> listHeroesByName(@RequestParam(required = false) String name) {
        return HEROES.stream()
                .filter(e -> e.equalsIgnoreCase(name))
                .toList();
    }

    @GetMapping("filterList")
    public List<String> listAllHeroesParametList(@RequestParam List<String> names) {
        return HEROES.stream()
                .filter(e -> names.contains(e))
                .toList();
    }

    @GetMapping("{name}")
    public String findByName(@PathVariable String name) {
        return HEROES.stream()
                .filter(e -> e.equalsIgnoreCase(name))
                .findFirst().orElse("");
    }

}
