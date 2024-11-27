package com.devdojo;

import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) {

        Pattern p = Pattern.compile(" ");

        String tmp = "Apenas um texto a mais";

        String[] tokens = tmp.split(" ");

        for (int i = 0; i < tokens.length; i++) {

            System.out.println(tokens[i]);

    }

 }
    
}