package com.devdojo.javacore.Aintroducaoclasses.teste;

import com.devdojo.javacore.Bintroducaometotdos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Calculadora calculadora = new Calculadora();

        a = calculadora.alteraDoisNumeros(a, b);
        System.out.println(a);
        System.out.println(b);
     }
}
