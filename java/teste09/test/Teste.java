package teste09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import devdojo.javacore.Zgenerics.dominio.Barco;



public class Teste {
    public static void main(String[] args) {
    
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate"),new Barco("Navio")));

        System.out.println(temNaLista(barcos, "Iaete"));
    


        



    }

    public static Optional<String> temNaLista(List<Barco> lisa,String nome){
        String teste = null;
        for(Barco b : lisa){
            if(b.getNome().equals(nome)){
                teste = b.getNome() + b.toString();
            }

        }
        return Optional.ofNullable(teste);
    }


}
