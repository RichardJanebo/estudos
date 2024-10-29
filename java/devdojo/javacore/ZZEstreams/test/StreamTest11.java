package devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import devdojo.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest11 {
    private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 3.99),
            new LightNovel("Naruto", 5.99),
            new LightNovel("Boku no Hero", 7.99),
            new LightNovel("One Push Man", 1.99),
            new LightNovel("Atack on Titan", 10.00),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Boruto", 4.99)));
    public static void main(String[] args) {
        
        
        DoubleSummaryStatistics doubleSummaryStatistics =  listlLightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(doubleSummaryStatistics.getSum());


        String string = listlLightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(string);
        
    }
}
