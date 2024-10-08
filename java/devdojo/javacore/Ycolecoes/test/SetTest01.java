package devdojo.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import devdojo.javacore.Ycolecoes.dominio.Manga;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Berserk", 22.0,5));
        mangas.add(new Manga(1L, "Pokemon", 13.5,0));
        mangas.add(new Manga(8L, "Attack on Titan", 6.8,2));
        mangas.add(new Manga(7L,"Dragon ball z" , 30,0));
        mangas.add(new Manga(7L,"Dragon ball z" , 30,0));

        System.out.println(mangas.contains(new Manga(7L,"Dragon ball z" , 30,0)));

        

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
