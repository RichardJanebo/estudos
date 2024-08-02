package devdojo.javacore.Gassociacao.test;

import devdojo.javacore.Gassociacao.dominio.Jogador;
import devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Maradoda");
        Time time = new Time("Brasil");
        jogador.setTime(time);
        jogador.imprimir();


    }
}
