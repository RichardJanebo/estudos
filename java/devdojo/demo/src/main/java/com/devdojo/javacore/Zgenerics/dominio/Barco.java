package com.devdojo.javacore.Zgenerics.dominio;

public class Barco {
    private String nome;

    public static void metodoStaticoTeste01(){
        System.out.println("Dentro do metodo estatico");
    }

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome  " + nome;
    }

    public String getNome() {
        return nome;
    }

    
    
}
