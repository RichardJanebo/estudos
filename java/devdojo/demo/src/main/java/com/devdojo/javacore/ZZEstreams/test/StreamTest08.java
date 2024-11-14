package com.devdojo.javacore.ZZEstreams.test;

import java.util.List;

import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;

public class StreamTest08 {

      private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 3.99),
            new LightNovel("Naruto", 5.99),
            new LightNovel("Boku no Hero", 7.99),
            new LightNovel("One Push Man", 1.99),
            new LightNovel("Atack on Titan", 10.00),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Boruto", 4.99)));
    public static void main(String[] args) {
        listlLightNovels.stream()
            .filter(e -> e.getPrice() < 3)
            .map(e -> e.getPrice())
            .reduce((e,a)->e+a)
            .ifPresent(System.out::println);
    }
    
}
