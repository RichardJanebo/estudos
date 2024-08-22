package teste09.test;

import teste09.dominio.Cachorro;
import teste09.dominio.Gato;
import teste09.dominio.InnerAnimal;

public class Teste {
    public static void main(String[] args) {
        InnerAnimal cachorro = new Cachorro();
        cachorro.setNome("bidu");
        cachorro.setSom("Latido");

        Gato gato = new Gato();
        if (gato instanceof Gato) {
            System.out.println("é uma instancia de gato");
        }
        gato.setNome("Floco");
        gato.setSom("Miado");
        gato.setCor("Marrom");

        gato.verificacaoDeAnimal(gato);
        cachorro.verificacaoDeAnimal(cachorro);

    }
}
