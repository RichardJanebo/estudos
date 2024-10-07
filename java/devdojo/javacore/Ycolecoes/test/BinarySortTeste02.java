package devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySortTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 22.0));
        mangas.add(new Manga(1L, "Pokemon", 13.5));
        mangas.add(new Manga(2L, "Attack on Titan", 6.8));
        mangas.add(new Manga(7L,"Dragon ball z" , 30));

        mangas.sort(new MangaByIdComparator());


        for(Manga manga : mangas){
            System.out.println(manga);
        }


        Manga mangaBynary = new Manga(2L,"Dragon ball z" , 30);

        System.out.println(Collections.binarySearch(mangas, mangaBynary));
    }
}
