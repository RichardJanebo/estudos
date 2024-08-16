package devdojo.javacore.Npolimorfismo.servico;

import devdojo.javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraDeImpostos {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser atribuido: " + imposto);

    }
}
