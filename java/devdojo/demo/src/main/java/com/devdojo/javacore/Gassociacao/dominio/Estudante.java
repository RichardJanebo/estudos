package com.devdojo.javacore.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private Seminarios seminario;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios seminario) {
        this.seminario = seminario;
    }

    public void imprimir() {
        System.out.println("Aluno " + nome);
        System.out.println("Seminario " + seminario.getNome());
    }

}
