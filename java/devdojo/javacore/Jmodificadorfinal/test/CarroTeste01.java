package devdojo.javacore.Jmodificadorfinal.test;

import devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
    
}
