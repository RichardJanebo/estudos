package com.devdojo.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable{
    private long id;
    private String nome;
    private String password;


    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    
}
