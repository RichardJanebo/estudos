package devdojo.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import devdojo.javacore.Ycolecoes.dominio.Consumidor;
import devdojo.javacore.Ycolecoes.dominio.Manga;

public class QueueTest02 {
    public static void main(String[] args) {
       Queue<Manga> mangas = new PriorityQueue<>(new ComparatorByPrice().reversed());
       mangas.add(new Manga(5L, "Berserk", 22.0,5));
       mangas.add(new Manga(1L, "Pokemon", 13.5,0));
       mangas.add(new Manga(8L, "Attack on Titan", 6.8,2));
       mangas.add(new Manga(7L,"Dragon ball z" , 30,0));
       mangas.add(new Manga(7L,"Dragon ball z" , 0,0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }


        
    }
}

class ComparatorByPrice implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }

}
