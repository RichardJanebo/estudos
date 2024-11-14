package com.devdojo.javacore.Bintroducaometotdos.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private char sexo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimir(){
        System.out.println("----------------");
        System.out.println("| Idade: " + getIdade() + "    |");
        System.out.println("| Nome: " + getNome() + "   |");
        System.out.println("| Sexo: " +getSexo() + "      |");
        System.out.println("----------------");
    }
    
    
}
