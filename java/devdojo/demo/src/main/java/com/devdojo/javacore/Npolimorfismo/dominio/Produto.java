package com.devdojo.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome,double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + "]";
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }


}
