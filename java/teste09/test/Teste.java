package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(10);
    numeros.add(20);
    numeros.add(30);
    numeros.add(40);

    Integer[] listToArrray = numeros.toArray(new Integer[0]);

    System.out.println(Arrays.toString(listToArrray));

    for(Integer indicesDoArray: listToArrray){
      System.out.println(indicesDoArray);
    }






  }
}