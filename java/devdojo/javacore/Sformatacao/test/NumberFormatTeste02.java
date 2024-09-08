package devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale locale = Locale.of("in","US");
        Locale localeBR = Locale.of("pt","BR");
        Locale usa = Locale.CANADA;
        NumberFormat[] numberFormat = new NumberFormat[4];


        numberFormat[0] = NumberFormat.getInstance(localeBR);
        numberFormat[1] = NumberFormat.getCurrencyInstance(locale);
        numberFormat[2] = NumberFormat.getCurrencyInstance(usa);
        numberFormat[3] = NumberFormat.getCurrencyInstance();

        String valorString = "$50,656";


        double valor = 50_655.600;
        for (NumberFormat numberFormat2 : numberFormat) {
            numberFormat2.setMaximumFractionDigits(0);
            System.out.println(numberFormat2.format(valor));
            
        }

        try{
            System.out.println(numberFormat[2].parse(valorString));
            
        }catch(ParseException e){
            e.printStackTrace();

        }
        
    }
    
}
