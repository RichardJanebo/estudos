package com.devdojo.javacore.Lclassesabstratas.dominio;

public  abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime(){
        System.out.println("Metodo Imprime");
    }

    public abstract void calculaBonus();
   
}
