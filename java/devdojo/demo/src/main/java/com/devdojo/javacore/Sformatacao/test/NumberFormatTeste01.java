package com.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale locale = Locale.of("in","US");
        Locale usa = Locale.CANADA;
        NumberFormat[] numberFormat = new NumberFormat[3];
        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(locale);
        numberFormat[2] = NumberFormat.getInstance(usa);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat2 : numberFormat) {
            System.out.println(numberFormat2.format(valor));
            
        }
        String valorString = "10_000.2130";
        try {
            System.out.println(numberFormat[0].parse(valorString));
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
}
