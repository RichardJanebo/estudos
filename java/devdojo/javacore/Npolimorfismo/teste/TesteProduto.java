package devdojo.javacore.Npolimorfismo.teste;

import devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class TesteProduto {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Rasteiro", 11);

        System.out.println(tomate);
        System.out.println(tomate.calcularImposto());
    }

}
