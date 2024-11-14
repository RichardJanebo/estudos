package com.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    private static List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public static void main(String[] args) {
        numeros.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        numeros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        numeros.stream().reduce(Integer::max).ifPresent(System.out::println);



        int nun = 0;
        for (int n = 0; n < numeros.size(); n++) {
            if(numeros.get(n) > nun){
                nun = numeros.get(n);
            }
        }

        System.out.println("Pegando o maior com for tradicional " + nun );

    }

}