package com.devdojo.javacore.Isobrescrita.diminio;

public class Anime extends Object {
    public String nome;

    

    

    @Override
    public String toString() {
        return "Anime [nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
