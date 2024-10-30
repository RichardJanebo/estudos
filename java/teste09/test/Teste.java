package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import teste09.dominio.Produto;

public class Teste {
    private static List<Produto> produtos = new ArrayList<>(
            List.of(new Produto<>("Arroez", null), new Produto<>("Feijão", null), new Produto<>("Batata", null)));

    public static void main(String[] args) {

        Optional<Produto> test1 = produtos.stream()
            .filter(e -> e.getNome().equals("Arroz"))
            .findFirst();
                    

        System.out.println("-----------------");

        System.out.println(test1.isPresent() ? "Vazio":test1);
        
    }

}