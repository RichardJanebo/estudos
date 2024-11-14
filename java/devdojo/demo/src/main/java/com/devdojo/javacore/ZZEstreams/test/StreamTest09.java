package com.devdojo.javacore.ZZEstreams.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.range(0, 10).filter(n -> n % 2 == 0).forEach(System.out::println);

        Stream.of("Eleve", " O ", " Cosmo ", "No ", " Seu Coração")
                .sorted(Comparator.naturalOrder())
                .map(e -> e.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        File file = new File("");

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String java;
            while ((java = bf.readLine()) != null) {
                for(String texto : java.split(" ")){
                    if(texto.equalsIgnoreCase("java")){
                        System.out.println(java);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
