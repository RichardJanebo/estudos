package com.devdojo.javacore.Bintroducaometotdos.test;

import com.devdojo.javacore.Bintroducaometotdos.dominio.Calculadora;

public class calculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] result = new int[5];

        for (int i = 0; i < 5; i++){
            result[i] = calculadora.multplicaDoisNumeros(i, i);
            System.out.println("indice " + i);
            System.out.println(result[i]);

        }
        
        
        calculadora.dividirDoisNumeros(4, 3);

        calculadora.testeDeNumeros(0);
    }
}
