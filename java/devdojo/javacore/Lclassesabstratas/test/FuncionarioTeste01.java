package devdojo.javacore.Lclassesabstratas.test;

import devdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import devdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Namy", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
       
}