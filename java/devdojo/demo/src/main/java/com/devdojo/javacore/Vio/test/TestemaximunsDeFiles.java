package com.devdojo.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestemaximunsDeFiles {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {
            bw.write("Ola mundo\r\n" + //
                    "Hello Word\r\n" + //
                    "Ola mundo\r\n" + //
                    "adfad699f9adf2daf\r\n" + //
                    "adf9a2dfads2f9a2dsffc292cdsa9f2d6s2f926dsf2,fd6sf62dsc2662sa3c2ads62262ca66\r\n" + //
                    "55662"); 

        
        
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            leitura(file);
        }
        

        
    }


    public static void leitura(File file){
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            String texto ;
            String total ="";
            while ((texto = br.readLine()) != null) {
                total += texto;
            }

            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(total);

            while(matcher.find()){
                System.out.print(matcher.group());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
