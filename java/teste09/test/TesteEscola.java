package teste09.test;

import java.util.Scanner;



public class TesteEscola {
    public static void main(String[] args) {
       Scanner entradaDados = new Scanner(System.in);
       System.out.println("Digite seu nome abaixo");
       String nome = entradaDados.nextLine();
       System.out.println("Digite sua idade");
       int idade = entradaDados.nextInt();
       System.out.println("Digite seu sexo M ou f");
       char letra  = entradaDados.next().charAt(0);
       String sexo = (letra == 'm' || letra == 'M')?"Maculino":"Feminino";
       System.out.println("Muito prazer "  + nome + "Você tem tem " + idade + "E é do sexo " + sexo);
       entradaDados.close();

    }
}
