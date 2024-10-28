package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import teste09.dominio.Produto;

public class Teste {
    private static List<List<String>> nomes = new ArrayList<>(
            List.of(List.of("Alice", "Bob", "Harrison", "Felipe", "Taumaturgo"),
                    List.of("Anael", "Lucas", "aLudimila", "Fernanda")));

    public static void main(String[] args) {
        List<String> nomesComA = nomes.stream()
                .flatMap(List::stream)
                .filter(nome -> nome.startsWith("a") || nome.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(nomesComA);
    }

}