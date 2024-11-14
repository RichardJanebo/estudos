package com.devdojo.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO = 0.21;
    public Televisao(String nome,double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }

    
    
}
