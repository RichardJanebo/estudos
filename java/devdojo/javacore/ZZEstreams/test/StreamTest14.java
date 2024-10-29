package devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import devdojo.javacore.ZZEstreams.dominio.Category;
import devdojo.javacore.ZZEstreams.dominio.LightNovel;
import devdojo.javacore.ZZEstreams.dominio.Promotion;

public class StreamTest14 {
    private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("OverLord", 3.99, Category.FANTASY),
            new LightNovel("Naruto", 5.99, Category.FANTASY),
            new LightNovel("Boku no Hero", 7.99, Category.DRAMA),
            new LightNovel("One Push Man", 1.99, Category.FANTASY),
            new LightNovel("Atack on Titan", 10.00, Category.DRAMA),
            new LightNovel("Demon Slayer", 2.99, Category.ROMANCE),
            new LightNovel("Demon Slayer", 2.99, Category.FANTASY),
            new LightNovel("Boruto", 4.99, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, Long> listLi = listlLightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(listLi);

        Map<Category, Object> listMap = listlLightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
                        

        System.out.println(listMap);

    }

}
