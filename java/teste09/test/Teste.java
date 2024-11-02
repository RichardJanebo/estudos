package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Teste {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,4,8,16,24,48,86));
        String inscrevase = "Inscreva-se no canal";
        String[] arrayinscrevase = inscrevase.split("");
        List<String> arrays = Arrays.asList(arrayinscrevase);


        Optional<Integer> reduce =numeros.stream()
            .reduce((n1,n2) -> n1 + n2);




        System.out.println(reduce);

        System.out.println("-------------------");

        Optional<String> stringREduce = arrays.stream()
            .reduce((a1,a2) -> a1.concat(a2));


        System.out.println(stringREduce);

        System.out.println("--------------------");
        Integer reduce01 =numeros.stream()
            .reduce(0,(n1,n2) -> n1 + n2);

        System.out.println(reduce01);;

        
    }

}