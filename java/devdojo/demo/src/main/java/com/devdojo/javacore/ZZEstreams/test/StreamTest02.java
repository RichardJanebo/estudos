package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;
import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest02 {
    private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 3.99),
            new LightNovel("Naruto", 5.99),
            new LightNovel("Boku no Hero", 7.99),
            new LightNovel("One Push Man", 1.99),
            new LightNovel("Atack on Titan", 10.00),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Boruto", 4.99)));

    public static void main(String[] args) {
        List<String> titles = listlLightNovels.stream()
            .sorted((o1,o2)->o1.getTitle().compareTo(o2.getTitle()))
            .filter(ln -> ln.getPrice() <= 4)
            .limit(3)
            .map(LightNovel::getTitle)
            .collect(Collectors.toList());

        System.out.println(titles);
    }
}
