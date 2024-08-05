package devdojo.javacore.Hheranca.test;

import devdojo.javacore.Hheranca.dominio.Endereco;
import devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01548198-42484");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Albert");
        pessoa.setCpf("5454545");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

    }
    
}
