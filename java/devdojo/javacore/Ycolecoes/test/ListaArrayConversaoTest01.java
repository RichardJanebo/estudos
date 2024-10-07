package devdojo.javacore.Ycolecoes.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);



        Integer[] listToArray = numeros.toArray(new Integer[0]);


        System.out.println(Arrays.toString(listToArray));

        System.out.println("--------------------------");

        Integer[] numerosToArray = new Integer[3];
        numerosToArray[0] = 1;
        numerosToArray[1] = 2;
        numerosToArray[2] = 3;


        List<Integer> arrayToList = Arrays.asList(numerosToArray);

        arrayToList.set(0, 12);

        
        System.out.println(Arrays.toString(numerosToArray));
        System.out.println(arrayToList);

        List<Integer> numerosList = new ArrayList<>(arrayToList);
        numerosList.add(54);

        System.out.println(numerosList);


        System.out.println("--------------------");

        List<Integer> testeIntegers = new ArrayList<>(arrayToList);
        testeIntegers.add(20);
        System.out.println(testeIntegers);
    }
}
