package devdojo.javacore.Bintroducaometotdos.test;

import devdojo.javacore.Bintroducaometotdos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraia");
        pessoa.setIdade(50);


        pessoa.imprimir();
    }
}
