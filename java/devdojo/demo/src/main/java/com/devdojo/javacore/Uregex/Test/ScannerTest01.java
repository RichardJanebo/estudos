package com.devdojo.javacore.Uregex.Test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Hoje, em, dia54545as ,pessoas , true";
        String[] textos = texto.split(",");
        for (String string : textos) {
            System.out.println(string);
        }
   }
}
