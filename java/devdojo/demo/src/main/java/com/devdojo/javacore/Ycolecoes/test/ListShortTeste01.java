package com.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListShortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Pokemon");
        mangas.add("Attack on Titan");
        mangas.add("Dragon ball z");

        Collections.sort(mangas);

        List<Double> dindin = new ArrayList<>();
        dindin.add(6D);
        dindin.add(8.6);
        dindin.add(9.6);
        dindin.add(5.1);
        dindin.add(9.7);

        Collections.sort(dindin);

        for (Double double1 : dindin) {
            System.out.println(double1);
        }

    }
}
