package devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDotecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite Sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M Ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        String sexoStr = (sexo == 'M' || sexo == 'm')? "Masculino":"Feminino";
        System.out.println("Seu nome é " + nome + " você tem " + idade +  " Anos e seu sexo é " + sexoStr);
        entrada.close();
    }   
}
