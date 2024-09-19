package devdojo.javacore.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for 
        // \s = Traz todos os espaços em brancos
        // \S = Traz todos os os caracteries excluindo os espaços
        


        String validacao = "\\s";
        String teste = "ad fadf1 56adf 1a5df41";

        Pattern pattern = Pattern.compile(validacao);
        Matcher matcher = pattern.matcher(teste);

       while (matcher.find()) {
        System.out.print("Posição " + matcher.start());
        System.out.println(" Numero :" + matcher.group());
       }
         
    }
    
}
