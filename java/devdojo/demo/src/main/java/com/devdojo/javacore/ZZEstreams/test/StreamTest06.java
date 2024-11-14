package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest06 {
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
        // List<String> priceMoreEight = listlLightNovels.stream()
        //     .filter(e -> e.getPrice() > 8)
        //     .map(e -> e.getTitle())
        //     .collect(Collectors.toList());

        // System.out.println(priceMoreEight);

        System.out.println(listlLightNovels.stream().anyMatch(ln -> ln.getPrice() > 8)); // AnyMath Existe Algum elemento maior que 8
        System.out.println(listlLightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // AllMath Todos os elementeos são maiores que 0
        System.out.println(listlLightNovels.stream().count());                           // Conta a quantidade de elementos 
        System.out.println(listlLightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));// Nenhum elemento é menor que 0
                
            
    }
}
