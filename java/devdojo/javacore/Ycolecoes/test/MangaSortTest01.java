package devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 22.0));
        mangas.add(new Manga(1L, "Pokemon", 13.5));
        mangas.add(new Manga(8L, "Attack on Titan", 6.8));
        mangas.add(new Manga(7L,"Dragon ball z" , 30));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        System.out.println("_------------------_");
        Collections.sort(mangas);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        
       
    }

    
    

   
}
