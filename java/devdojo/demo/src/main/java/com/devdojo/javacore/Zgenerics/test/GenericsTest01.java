package com.devdojo.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.javacore.Ycolecoes.dominio.Consumidor;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoria");


        add(lista, new Consumidor("Goku").toString());

        for (Object o : lista) {
            System.out.println(o);
        }
        
    }

    public static void add(List<String> lista , String consumidor){
        lista.add(consumidor);
    }
}
