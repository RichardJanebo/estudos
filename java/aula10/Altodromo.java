package aula10;

public class Altodromo {
    public static void main(String[] args) {
        Carro supra = new Carro();
        supra.ligar();
        supra.setchassi("652746626");


        Moto z800 = new Moto();

        z800.setchassi("80853");
        System.out.println(z800.getChassi());

    }
    

}
