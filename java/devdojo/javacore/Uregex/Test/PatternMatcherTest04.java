package devdojo.javacore.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // [] reange
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} n até m
        // () Agrupamento
        // | ou
        // $  fim
        // . 

        


        String validacao = "0[Xx]([0-9A-F])+(\\s|$)";
        String teste = "12 0x 0X 0xFFABC 0X10G 0X1";

        Pattern pattern = Pattern.compile(validacao);
        Matcher matcher = pattern.matcher(teste);
        int numeroHexx ;

       while (matcher.find()) {
        System.out.print("Posição " + matcher.start());
        System.out.println(" Numero :" + matcher.group());
       }


    //    System.out.println(numeroHexx);
         
    }
    
}
