package teste09.test;

import java.util.ArrayList;
import java.util.List;

import teste09.dominio.Animal;
import teste09.dominio.Cachorro;
import teste09.dominio.Gato;

public class Teste {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for(Animal animal:animais){
            animal.fazerSom();
        }
    }
}
