package com.devdojo.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

import com.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import com.devdojo.javacore.Ycolecoes.dominio.Manga;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumido1 = new Consumidor( "Richard");
        Consumidor consumido2 = new Consumidor( "Teste");

        Manga manga1 = new Manga(5L, "Berserk", 22.0);
        Manga manga2 = new Manga(1L, "Pokemon", 13.5);
        Manga manga3 = new Manga(2L, "Attack on Titan", 6.8);
        Manga manga4 = new Manga(7L,"Dragon ball z" , 30);


        Map<Consumidor,Manga> consuManga = new HashMap<>();

        consuManga.put(consumido1, manga4);
        consuManga.put(consumido2, manga1);
        consuManga.putIfAbsent(consumido1, manga3);
        consuManga.putIfAbsent(consumido2, manga2);

        for(Map.Entry<Consumidor,Manga> entry : consuManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " " + entry.getValue().getNome());
        }


    }
    
}
