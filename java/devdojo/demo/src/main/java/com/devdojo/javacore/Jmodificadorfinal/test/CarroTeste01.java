package com.devdojo.javacore.Jmodificadorfinal.test;

import com.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import com.devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
    
}
