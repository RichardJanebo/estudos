package com.devdojo.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
          String linha ;
          while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
          }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
