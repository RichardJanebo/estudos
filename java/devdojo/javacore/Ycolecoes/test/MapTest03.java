package devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import devdojo.javacore.Ycolecoes.dominio.Consumidor;
import devdojo.javacore.Ycolecoes.dominio.Manga;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumido1 = new Consumidor( "Richard");
        Consumidor consumido2 = new Consumidor( "Teste");

        Manga manga1 = new Manga(5L, "Berserk", 22.0);
        Manga manga2 = new Manga(1L, "Pokemon", 13.5);
        Manga manga3 = new Manga(2L, "Attack on Titan", 6.8);
        Manga manga4 = new Manga(7L,"Dragon ball z" , 30);

        List<Manga> mangaConsumidorList = List.of(manga1,manga2,manga3);

        Map<Consumidor,List<Manga> > consuManga = new HashMap<>();
        consuManga.put(consumido1, mangaConsumidorList);
        consuManga.put(consumido2, List.of(manga4));

        for(Map.Entry<Consumidor, List<Manga>> entry : consuManga.entrySet()){
            System.out.println("----------------------------");

            System.out.println("nome: " + entry.getKey().getNome());
            System.out.println("Anime: ");
            for (Manga manga : entry.getValue()) {
                System.out.println("|" + manga.getNome() + "|");
            }
            System.out.println("----------------------------");

        }

        

        


    }
    
}
