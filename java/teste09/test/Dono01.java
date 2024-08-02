package teste09.test;

import teste09.dominio.Carro;
import teste09.dominio.Dono;

public class Dono01 {
    public static void main(String[] args) {
        Dono dono = new Dono("Richard");
        Carro camaro = new Carro("Camaro");

        dono.setCarro(camaro);

        dono.imprimir();


    }
    
}
