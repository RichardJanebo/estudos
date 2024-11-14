package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devdojo.javacore.ZZEstreams.dominio.Category;
import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;
import com.devdojo.javacore.ZZEstreams.dominio.Promotion;

public class StreamTest13 {
    private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("OverLord", 3.99, Category.FANTASY),
            new LightNovel("Naruto", 5.99, Category.FANTASY),
            new LightNovel("Boku no Hero", 7.99, Category.DRAMA),
            new LightNovel("One Push Man", 1.99, Category.FANTASY),
            new LightNovel("Atack on Titan", 10.00, Category.DRAMA),
            new LightNovel("Demon Slayer", 2.99, Category.ROMANCE),
            new LightNovel("Demon Slayer", 2.99, Category.FANTASY),
            new LightNovel("Boruto", 4.99, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> listMap = listlLightNovels.stream().collect(Collectors.groupingBy(ln -> {
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
        }));

        System.out.println(listMap);

        System.out.println("-----------------------");

        Map<Category, Map<Promotion, List<LightNovel>>> listMap2 = listlLightNovels.stream()
                .collect(Collectors.groupingBy(ls -> ls.getCategory(), Collectors
                        .groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(listMap2);

    }

}
