package devdojo.javacore.Npolimorfismo.test;

import devdojo.javacore.Npolimorfismo.dominio.Computador;
import devdojo.javacore.Npolimorfismo.dominio.Produto;
import devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen555", 3000);
        System.out.println(produto);
        System.out.println(produto.calcularImposto());
        
        System.out.println("--------------------------");

        Produto produto2 =new  Tomate("Tomate Americano", 5);
        System.out.println(produto2);
        System.out.println(produto2.calcularImposto());
        
        
    }
    
}
