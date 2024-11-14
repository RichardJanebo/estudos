package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devdojo.javacore.ZZEstreams.dominio.Category;
import com.devdojo.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest12 {
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

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romace = new ArrayList<>();

        for (LightNovel lightNovel : listlLightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case ROMANCE:
                    romace.add(lightNovel);
                    break;
                case FANTASY:
                    fantasy.add(lightNovel);
                default:
                    break;
            }
        }

        Map<Category, List<LightNovel>> collect = listlLightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }

}
