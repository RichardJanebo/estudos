package com.devdojo.javacore.Zgenerics.dominio;

public class Carro {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome  " + nome;
    }

    
}
