package com.devdojo.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String>  test01 = findName01("Robedrta");

        String test02= findName02("Rafa");



        System.out.println(test01);

        System.out.println("------------");

        System.out.println(test02);
        

    
    }

    private static Optional<String> findName01(String name) {
        List<String> lista = List.of("Paulo", "Roberta", "Lucas");
        int i = lista.indexOf(name);
        if (i != -1) {
            return Optional.of(lista.get(i));
        }
        return Optional.empty();
    }

    private static String findName02(String nome){
        List<String> lista = List.of("Paulo", "Roberta", "Lucas");
        int i = lista.indexOf(nome);
        if(i != -1){
            return lista.get(i);
        }
        return null;
    }
}
