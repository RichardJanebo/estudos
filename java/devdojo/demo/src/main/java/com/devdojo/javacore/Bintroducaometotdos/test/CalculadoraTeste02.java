package com.devdojo.javacore.Bintroducaometotdos.test;

import com.devdojo.javacore.Bintroducaometotdos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.dividirDoisNumeros(calculadora.multplicaDoisNumeros(5, 4), 0);
    }
}
