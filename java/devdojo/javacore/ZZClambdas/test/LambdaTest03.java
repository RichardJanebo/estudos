package devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Paulo", "Rodrigo", "Stefany", "Luisa", "Lucas"));

        Consumer<String> printString = s -> imprimeQuantidadeDeLetrasNoNome(s); // Void

        Predicate<String> printIfStefany = s -> s.equals("Stefany"); // Boolean

        Function<String, Integer> pegaQuantidade = String::length; // Pega um tipo e transforma em outro

        for (String string : nomes) {
            printString.accept(string);
            System.out.println(printIfStefany.test(string) ? string : "Invalido");
            System.out.println(pegaQuantidade.apply(string));

        }

        System.out.println(map(nomes, new Predicate<String>() {
            @Override
            public boolean test(String t) {
                if (t.equals("Rodrigo")) {
                    System.out.println("Encontramos o Rodrigo");
                    return true;
                } else {
                    return false;
                }
            }
        }));

    }

    public static void imprimeQuantidadeDeLetrasNoNome(String string) {
        System.out.println(string.length());
    }

    public static <T> List<T> map(List<T> lista, Predicate<T> predicate) {
        List<T> outherList = new ArrayList<>();

        for (T t : lista) {
            if (predicate.test(t)) {
                outherList.add(t);
            }

        }
        return outherList;
    }

}