package devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei suane","Catarina", "Sndy");
        List<String> developers = List.of("Willian","Richard","David");
        List<String> students = List.of("Gustavo","Wesley","Lucas","Guilherme");


        devDojo.add(students);
        devDojo.add(developers);
        devDojo.add(graphicDesigners);

        List<String> nomesAll = new ArrayList<>();
        devDojo.forEach(e -> e.forEach(s -> nomesAll.add(s)));

        System.out.println(nomesAll);


        System.out.println("--------------");

        devDojo.stream()
            .flatMap(Collection::stream)
            .forEach(System.out::println);
    }
}
