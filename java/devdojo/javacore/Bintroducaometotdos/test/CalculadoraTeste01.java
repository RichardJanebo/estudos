package devdojo.javacore.Bintroducaometotdos.test;

import devdojo.javacore.Bintroducaometotdos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora);
        calculadora.somarDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando calculadoraTeste01");
        calculadora.multplicaDoisNumeros(10, 65);
        
    }
}
