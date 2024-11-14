package com.devdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome,double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }

    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.5;
        
    }

    
    
}
