package com.devdojo.javacore.Gassociacao.test;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LeituraDoTecladoTeste02 {
    public static void main(String [] aergs){
        try {
            File arquivo = new File("C:\\Users\\richa\\Desktop\\testeEscaner.txt");
            Scanner entrada = new Scanner(arquivo);

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                System.out.println(linha);
            }

            // Fecha o Scanner
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }



        
    }
}
