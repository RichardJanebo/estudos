package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import teste09.dominio.Produto;

public class Teste {
    private static List<List<String>> nomes = new ArrayList<>(List.of(List.of("Alice","Bob","Harrison","Felipe","Taumaturgo"), List.of("Anael","Lucas","Ludimila","Fernanda")));
    


    public static void main(String[] args) {

        List<Stream<String>> lStrings = nomes.stream()
            .map(e -> e.stream())
            .collect(Collectors.toList());



        List<String> listWithFlatMap = nomes.stream()
            .flatMap(e -> e.stream())
            .map(e -> e.split(""))
            .flatMap(e -> Arrays.stream(e))
            .collect(Collectors.toList());

        System.out.println(listWithFlatMap);

       

        }
    
}