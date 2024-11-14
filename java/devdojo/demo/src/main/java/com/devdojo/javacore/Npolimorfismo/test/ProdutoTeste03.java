package com.devdojo.javacore.Npolimorfismo.test;

import com.devdojo.javacore.Npolimorfismo.dominio.Computador;
import com.devdojo.javacore.Npolimorfismo.dominio.Produto;
import com.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import com.devdojo.javacore.Npolimorfismo.servico.CalculadoraDeImpostos;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen555", 3000);
       
        
        System.out.println("--------------------------");

        Tomate tomate =new  Tomate("Tomate Americano", 5);
        tomate.setDataValidade("12/12/2025");

        CalculadoraDeImpostos.calcularImposto(tomate);
        CalculadoraDeImpostos.calcularImposto(produto);
        
        
       
        
    }
    
}
