package teste09.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import teste09.dominio.Produto;



public class Teste {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Produto produto = new Produto<>("Arroz", 29.9);

        List<String> nomes = new ArrayList<>(List.of("Maçã","Banana","Pera","Uva","Jabuticaba","Melão","Melancia","cacal"));

        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));


        produto.setLista(nomes);
        produto.setLista(numeros);

        System.out.println(LocalDate.now().getYear()
        );

        
        
    }
    
}