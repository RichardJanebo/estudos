package devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Paulo", "Rodrigo", "Stefany", "Luisa", "Lucas"));

    
        System.out.println(map(nomes, s -> s.toUpperCase()));


    }
 
    public static <T,R> List<R> map(List<T> lista, Function<T,R> function){
        List<R> saida = new ArrayList<>();

        for(T eEntrada : lista){
            saida.add(function.apply(eEntrada));
        }
        return saida;
    }

}