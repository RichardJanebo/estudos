package devdojo.javacore.Aintroducaoclasses.teste;

import devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class PessoaTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 20;
        estudante.nome = "Richard";
        estudante.sexo = 'm';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
