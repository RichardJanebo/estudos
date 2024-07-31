package teste09.test;

import teste09.dominio.Carros;

public class CarroTeste {
    public static void main(String[] args) {
        Carros carros = new Carros();


        int[] numeros = new int[3];
        numeros[0] = 30;
        numeros[1] = 65;
        numeros[2] = 82;
        
        carros.somar(numeros);
    }
    
}
