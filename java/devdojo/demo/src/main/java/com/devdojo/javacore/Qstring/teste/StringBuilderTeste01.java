package com.devdojo.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";

        nome.concat("Dev Dojo");

        System.out.println( nome);

        StringBuilder sb = new StringBuilder("Willian suane");
        sb.append(nome).append("academy");
        

        System.out.println( sb.substring(0,2));
        System.out.println(sb.reverse());
        StringBuilder codigoCriptografado = sb.reverse();
        System.out.println(codigoCriptografado.delete(0, 0));

        
        

    }
}
