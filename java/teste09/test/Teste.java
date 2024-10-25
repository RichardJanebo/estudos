package teste09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import teste09.dominio.Produto;

public class Teste {
    @SuppressWarnings("rawtypes")
    private static List<Produto> produtos = new ArrayList<>(List.of(new Produto<>("Arroz", 20D),new Produto<>("Acucar", 10D ),new Produto<>("Feijão", 9.99)));


    public static void main(String[] args) {

        List<String> lista = produtos.stream()
            .sorted((o1,o2)-> o1.getNome().compareTo(o2.getNome()))
            .filter(p -> p.getPreco() <= 10)
            .map(Produto::getNome)
            .collect(Collectors.toList());

            System.out.println(lista);
    }
    
}