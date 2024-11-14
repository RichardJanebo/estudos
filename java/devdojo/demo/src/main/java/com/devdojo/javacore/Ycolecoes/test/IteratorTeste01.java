package com.devdojo.javacore.Ycolecoes.test;

import java.util.List;

import com.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Berserk", 22.0,5));
        mangas.add(new Manga(1L, "Pokemon", 13.5,0));
        mangas.add(new Manga(8L, "Attack on Titan", 6.8,2));
        mangas.add(new Manga(7L,"Dragon ball z" , 30,0));


       Iterator<Manga> mangIterator = mangas.iterator();

    //    while (mangIterator.hasNext()) {
    //       if(mangIterator.next().getQuantidade() == 0){

    //         mangIterator.remove();
    //       }
    //    }

       
       mangas.removeIf(manga -> manga.getQuantidade() == 0);
       
       System.out.println(mangas);


    

       
    }
}
