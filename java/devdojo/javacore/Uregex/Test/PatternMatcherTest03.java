package devdojo.javacore.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // [] reange
        

        


        String validacao = "0[Xx][0-9A-F]";
        String teste = "12 0x 0X 0xFFABC 0X109 0X1";

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
