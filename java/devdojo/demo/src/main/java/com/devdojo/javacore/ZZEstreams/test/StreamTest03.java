package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest03 {
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
        Stream<LightNovel> stream = listlLightNovels.stream();
        listlLightNovels.forEach(System.out::println);

        Long cont = stream.filter(ls -> ls.getPrice() < 4).count();

        long count02 = listlLightNovels.stream().distinct().filter(ln -> ln.getPrice() < 4).count();

        System.out.println(count02);

        System.out.println(cont);
    }
}
