package com.devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.devdojo.javacore.ZZClambdas.dominio.Anime;
import com.devdojo.javacore.ZZClambdas.service.AnimeComparator;

public class MetodoReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of( new Anime("Dragon Ball Z", 600), new Anime("Naruto", 500),new Anime("Berserk", 5)));



        animeList.sort(AnimeComparator::compareByTitle);
        System.out.println(animeList);

        
    }
}
