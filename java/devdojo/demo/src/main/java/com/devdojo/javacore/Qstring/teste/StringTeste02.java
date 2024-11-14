package com.devdojo.javacore.Qstring.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "     Luffy     ";
        String numeros ="012345";

        

        System.out.println(nome.replace("f", "l"));

        System.out.println(numeros.substring(0, 3));



        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(nome.trim().length());
        for(int n = 0;n< nome.length();n++){
            System.out.println(nome.charAt(n));
        }

      
    }
}
