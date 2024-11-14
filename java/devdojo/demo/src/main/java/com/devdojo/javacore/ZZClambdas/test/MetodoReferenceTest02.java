package com.devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.javacore.ZZClambdas.dominio.Anime;
import com.devdojo.javacore.ZZClambdas.service.AnimeComparator;

public class MetodoReferenceTest02 {
    public static void main(String[] args) {
        
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of( new Anime("Dragon Ball Z", 600), new Anime("Naruto", 500),new Anime("Berserk", 5)));


        // animeList.sort(animeComparator::compareByTitleNonStatic);

        animeList.sort((a1,a2) -> animeComparator.compareByTitleNonStatic(a1, a2));



        System.out.println(animeList);
    }

    

}
