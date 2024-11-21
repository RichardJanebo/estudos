package com.devdojo.javacore.revisoes.model;

public class ProducerRevisao {
    private Integer id;
    private String nome;

    public ProducerRevisao(String nome) {

        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
