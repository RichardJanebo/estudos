package devdojo.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animals = new ArrayList<>();


        printConsulta(gatos);
        printConsulta(cachorros);

        printConsultaAnimal(animals);
    }


    private static void printConsulta(List<? extends Animal> animals){
        for(Animal animal:animals){
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();

        animals.add(animal);
    }
}
