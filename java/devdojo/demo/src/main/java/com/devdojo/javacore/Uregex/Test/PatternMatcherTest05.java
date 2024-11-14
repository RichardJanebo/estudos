package com.devdojo.javacore.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
       String padrao = "([a-zA-Z0-9\\._-])+@([a-zA-Z0-9])+([\\.|a-zA-Z])+([\\.|a-zA-Z])*";
       String teste = "luffy@hotmail.com, 123jotaro@gmail.com, #zoro@email.comteste@gmail.com.br, sakura@email";

       Pattern pattern = Pattern.compile(padrao);
       Matcher matcher = pattern.matcher(teste);

       while (matcher.find()) {
        System.out.print("Posição " + matcher.start());
        System.out.println(" Numero :" + matcher.group());
       }
        


       
         
    }
    
}
