package devdojo.javacore.Oexcepition.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExcepitionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("devdojo\\arquivo\\text.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Este arquivo esta sendo escrito via terminal\n Linha 2");
            fileWriter.close();

            Scanner entrada = new Scanner(file);

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                System.out.println(linha);

            }

            System.out.println(
                    "true");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}