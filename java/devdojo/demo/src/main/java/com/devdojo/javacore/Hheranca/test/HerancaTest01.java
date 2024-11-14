package com.devdojo.javacore.Hheranca.test;

import com.devdojo.javacore.Hheranca.dominio.Endereco;
import com.devdojo.javacore.Hheranca.dominio.Funcionario;
import com.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01548198-42484");

        Pessoa pessoa = new Pessoa("Albert");
        pessoa.setCpf("5454545");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        

        System.out.println("---------------------");
        Funcionario funcionario = new Funcionario("Gastuns");
        funcionario.setCpf("8454848");
        funcionario.setSalario(3000);
        funcionario.setEndereco(endereco);

        funcionario.imprimer();



    }
    
}
