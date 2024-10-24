package devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import devdojo.javacore.ZZEstreams.dominio.LightNovel;

//Ordene Por titulo
// Retrive the first 3 light novels with less than 4
public class StreamTest01 {

    private static List<LightNovel> listlLightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 3.99),
            new LightNovel("Naruto", 5.99),
            new LightNovel("Boku no Hero", 7.99),
            new LightNovel("One Push Man", 1.99),
            new LightNovel("Atack on Titan", 10.00),
            new LightNovel("Demon Slayer", 2.99),
            new LightNovel("Boruto", 4.99)));

    public static void main(String[] args) {
        listlLightNovels.sort((o1,o2) -> o1.getTitle().compareTo(o2.getTitle()));

        listlLightNovels.forEach(System.out::println);

        System.out.println("---------------------");

        for(int i = 0; i < listlLightNovels.size() ; i ++){
            if(listlLightNovels.get(i).getPrice() <= 4 ) System.out.println(listlLightNovels.get(i).getTitle());
        }
    }
}
