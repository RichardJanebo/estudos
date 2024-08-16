package devdojo.javacore.Npolimorfismo.test;

import devdojo.javacore.Npolimorfismo.dominio.Computador;
import devdojo.javacore.Npolimorfismo.dominio.Televisao;
import devdojo.javacore.Npolimorfismo.dominio.Tomate;
import devdojo.javacore.Npolimorfismo.servico.CalculadoraDeImpostos;

public class TesteProduto {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Rasteiro", 11);

        Computador computador = new Computador("Icer aspire 3", 3000);

        Televisao televisao = new Televisao("Sansung 50\" ", 2000);


        System.out.println("------------------------------------");
        CalculadoraDeImpostos.calcularImposto(tomate);

        System.out.println("------------------------------------");
        CalculadoraDeImpostos.calcularImposto(computador);

        System.out.println("------------------------------------");
        CalculadoraDeImpostos.calcularImposto(televisao);

    }

}
