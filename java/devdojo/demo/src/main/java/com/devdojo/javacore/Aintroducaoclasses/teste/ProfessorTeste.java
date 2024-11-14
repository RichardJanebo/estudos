package com.devdojo.javacore.Aintroducaoclasses.teste;

import com.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Girafales";
        professor.idade = 50;
        professor.sexo = "m";

        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }
}
