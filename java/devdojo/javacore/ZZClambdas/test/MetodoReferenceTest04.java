package devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import devdojo.javacore.ZZClambdas.dominio.Anime;
import devdojo.javacore.ZZClambdas.service.AnimeComparator;

public class MetodoReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of( new Anime("Dragon Ball Z", 600), new Anime("Naruto", 500),new Anime("Berserk", 5)));

        
        animeList.sort(animeComparator::compareByTitleNonStatic);
    }
}
