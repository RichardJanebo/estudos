package com.devdojo.javacore.ZZClambdas.service;

import com.devdojo.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparator {
    public static int compareByTitle(Anime a1 ,Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static String imprimeAnime(Anime anime){
        return anime.toString();
    }

    public String imprimeAnimeNonStatic(Anime anime){
        return anime.toString();
    }

    public  int compareByTitleNonStatic(Anime a1 ,Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
