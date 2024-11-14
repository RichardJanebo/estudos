package com.devdojo.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome){
        this.nome = nome;
    }

    public Escola(String nome,Professor [] professores){
        this(nome);
        this.professores = professores;
    }






    public void imprimir(){
        System.out.println(nome);
        if(professores != null){
            for(Professor professor:professores){
                System.out.println(professor.getNome());
            } 
        }
    }



    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setProfessores(Professor [] professores){
        this.professores = professores;
    }

    public Professor[] getProfessor(){
        return professores;
    }

}
