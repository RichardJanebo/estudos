package teste09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import devdojo.javacore.Aintroducaoclasses.exercicio.carro.Carro;

public class Teste {
    public static void main(String[] args) {
        {
            System.out.println("No Bloco de inicialização");
        }
        List<String> carros = new ArrayList<>();
        carros.add("Camaro");
        carros.add("Fusion");
        carros.add("Corola");
        carros.add("Maverick");
        carros.add("Landal");


        List<Integer> idades = new ArrayList<>();
        idades.add(10);
        idades.add(16);
        idades.add(30);
        idades.add(35);
        idades.add(50);

        idades.forEach( e -> System.out.println(e >= 18 ? e :"não " + e) );

        System.out.println("--------------------");

        Function<Integer,String> integerToString = e ->  e.toString();

        System.out.println("---------------------");

        List<String> idade = new ArrayList<>();
        
        
        for(int n : idades){
            idade.add(integerToString.apply(n));
        }

        System.out.println(idade);




    }

    public static <T> List<T> filter(List<T> lista, Predicate<T> predicate) {
        List<T> outherList = new ArrayList<>();
        for (T t : lista) {
            if (predicate.test(t)) {
                outherList.add(t);
            }
        }

        return outherList;
    }

}
