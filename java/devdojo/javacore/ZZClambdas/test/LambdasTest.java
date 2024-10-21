package devdojo.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest {

    public static void main(String[] args) {
        List<String> nomes = List.of("Goku", "Ang", "Midoya", "Uraraka");

        forEach(nomes, s -> printNome(s));

        
    }

    public static void printNome(String n){
        System.out.println(n);
    }

    public static <T> void forEach(List<T> lista,Consumer<T> consumer){
        for (T t : lista) {
            consumer.accept(t);
        }
    }
}
