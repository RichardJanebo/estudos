package teste09.test;

import java.util.ArrayList;
import java.util.List;

import teste09.dominio.Cachorro;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", 4, "Au AU Au");
        Cachorro cachorro2 = new Cachorro("Pit", 4, "Wof wof");
        Cachorro cachorro3 = new Cachorro("Belinha", 4, "Auuuu auuu");

        ArrayList<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);

        
        for(Cachorro cachorro : cachorros){
            System.out.println(cachorro);
        }

        Integer d = 10; //autoBoxinfg

        int s = d; // Umboxing


        
      
    }

}
