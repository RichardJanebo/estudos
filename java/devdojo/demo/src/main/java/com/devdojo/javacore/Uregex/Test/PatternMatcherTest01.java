package com.devdojo.javacore.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String validacao = "@gmail.com";
        String teste = "dafsdvacsda@gmail.com";

        Pattern pattern = Pattern.compile(validacao);
        Matcher matcher = pattern.matcher(teste);

        if(matcher.find()){
            System.out.println("O gmail e valido");
        }else{
            System.out.println("O gmail não é valido");
        }

         
    }
    
}
