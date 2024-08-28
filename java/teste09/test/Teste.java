package teste09.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import teste09.dominio.EnunsTeste;
import teste09.dominio.Gato;

public class Teste {
    public static void main(String[] args) throws IOException {
        


        Gato gato = new Gato("Floco", "Branco", EnunsTeste.DOMINGO, "Mial");

        Scanner inputData = new Scanner(System.in);
        String fileX = inputData.nextLine();

        
        inputData.close();
        System.out.println(fileX);

        File file = new File(fileX);

        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(gato.getNome() + " " + gato.getCor() + " " + gato.getDia() + " " + gato.getSom());
            bufferedWriter.newLine();
            bufferedWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            try {

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                bufferedReader.close();
            }

            System.out.println("Este arquivo existe");
        } else {
            System.out.println("Esse arquivo não existe");
        }

    }

}
