package devdojo.tiposPrimitivos;

public class Aula04Operadores {
    public static void main(String[] args) {
        // int numero1 = 10;
        // int numero2 = 20;

        // int soma = numero1 + numero2;
        // int subtracao = numero1 - numero2;
        // int multiplicacao = numero1 * numero2;
        // double divisao = (double ) numero1 / numero2;
        // int numero = 10;
        // String numeroDez = "10";

        double valorTotalContaCorrente = 200;
        double valorTotalContaPolpanca = 6000;
        float valorPlayStation = 5000F;



        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPolpanca > valorPlayStation;


        System.out.println( "Vc Comprara ? " + isPlayStationCincoCompravel);




        //< menor que 
        //> maior que
        // <= menor igual a
        // >= menor igual a
        // == igual a 
        //!= diferente
        // while (numero < 20) {
        //     System.out.println("Repetindo numereo :" + numero);
        //     numero++;
        // }
        // for(int i = 10; i< 15;i++){
        //     System.out.println(i);
        // }

        // if(soma > numero1 || numeroDez =="dez"){
        //     System.out.println("condição satisfeita");
        // }
        // System.out.println("Soma"+ soma);
        // System.out.println("Subtração" + subtracao);
        // System.out.println("Multipilcacao " + multiplicacao);
        // System.out.println("Divisão " + divisao);


        double bonus = 1800;
        bonus -= 1000;
        bonus *= 2;
        System.out.println(bonus);

        double i = 10.0;
        
        System.out.println( i++);
        

        
    }
}
