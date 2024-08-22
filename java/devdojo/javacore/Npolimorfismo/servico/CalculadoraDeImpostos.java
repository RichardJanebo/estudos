package devdojo.javacore.Npolimorfismo.servico;

import devdojo.javacore.Npolimorfismo.dominio.Produto;
import devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraDeImpostos {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser atribuido: " + imposto);

        if(produto instanceof Tomate){
            Tomate tomate =(Tomate) produto;
            ((Tomate) produto).getDataValidade();
            System.out.println(tomate.getDataValidade());
        }

    }
}
