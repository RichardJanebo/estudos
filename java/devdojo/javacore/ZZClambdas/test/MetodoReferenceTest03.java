package devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MetodoReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru", "5"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> stringByInteger = Integer::parseInt;
        BiPredicate<List<String> ,String> temNaLista = List::contains;

        System.out.println(temNaLista.test(nomes, "Rimuru"));

        nomes.forEach((e) -> {
            if(e.equals("5")){
                
                System.out.println(stringByInteger.apply(e) + 5);
            }
        });
    }
}
