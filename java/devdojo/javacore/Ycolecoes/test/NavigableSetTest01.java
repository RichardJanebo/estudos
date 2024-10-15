package devdojo.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import devdojo.javacore.Ycolecoes.dominio.Manga;
import devdojo.javacore.Ycolecoes.dominio.SmartPhoone;
class SmartPhooneNomeComparator implements Comparator<SmartPhoone>{

    @Override
    public int compare(SmartPhoone o1, SmartPhoone o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhoone> set = new TreeSet<>(new SmartPhooneNomeComparator());
        SmartPhoone smartPhoone = new SmartPhoone("Nokia", "123");
        set.add(smartPhoone);


        NavigableSet<Manga> mangas = new TreeSet<>(new SetComparatorByPrice());
        mangas.add(new Manga(5L, "Berserk", 22.0,5));
        mangas.add(new Manga(1L, "Pokemon", 13.5,0));
        mangas.add(new Manga(8L, "Attack on Titan", 6.8,2));
        mangas.add(new Manga(7L,"Dragon ball z" , 30,0));
        mangas.add(new Manga(7L,"Dragon ball z" , 0,0));



        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        System.out.println("-----------------------");



        Manga bigHero  =  new Manga(2L,"Big hero academy" , 8,5);

        System.out.println(mangas.lower(bigHero));
        System.out.println(mangas.floor(bigHero));
        System.out.println(mangas.higher(bigHero));
        System.out.println(mangas.ceiling(bigHero));




        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());


    }




    //lower <
    //floor <=
    //higher 
    //ceiling


    
}
class SetComparatorByPrice implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {

        return Double.compare(o1.getPreco(), o2.getPreco());
    }


  

}
