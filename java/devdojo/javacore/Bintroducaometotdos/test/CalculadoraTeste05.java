package devdojo.javacore.Bintroducaometotdos.test;

import devdojo.javacore.Bintroducaometotdos.dominio.Funcionario;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Seu Madruga");
        // funcionario.setIdade(0);
        
        funcionario.setSalario(3000,7000,3060,6000,3500);

        funcionario.mediaSalarios();
        System.out.println("---------------------");
        funcionario.imprimirOsDados();
    }
}
