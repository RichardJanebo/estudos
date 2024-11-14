package com.devdojo.javacore.Bintroducaometotdos.test;

import com.devdojo.javacore.Bintroducaometotdos.dominio.Calculadora;
import com.devdojo.javacore.Bintroducaometotdos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        Calculadora calculadora = new Calculadora();

        

        

        estudante.setNome("Goku");
        estudante.setIdade(50);
        estudante.setSexo('m');

        estudante2.setNome("Gamora");
        estudante2.setIdade(32);
        estudante2.setSexo('f');
        
        estudante.imprimir();
        estudante2.imprimir();


        
        
    }
}
