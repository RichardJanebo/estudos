package teste09.test;

import teste09.dominio.Bicicleta;
import teste09.dominio.Dono;

public class DonoBicicleta {
    public static void main(String[] args) {
         Dono dono =new Dono("Richard");
         Bicicleta bicicleta = new Bicicleta("Kaloi poti");

         bicicleta.setDonoBicicleta(dono);


         bicicleta.imprimir();
    }
    
}
