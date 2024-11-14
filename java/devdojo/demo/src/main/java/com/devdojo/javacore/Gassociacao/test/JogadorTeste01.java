package com.devdojo.javacore.Gassociacao.test;

import com.devdojo.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Mbape");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");
    
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        System.out.println( Jogador.getContadorDeInstancias());

        


        

        for(Jogador jogador:jogadores){
            jogador.imprimir();
        }

    }


     
}