package devdojo.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String mascara = "'Campo grande dia' dd 'do' MMMM 'de 'YYYY HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(mascara);
        System.out.println(simpleDateFormat.format(new Date()));


        try{
            
           System.out.println(simpleDateFormat.parse("Campo grande dia 08 do setembro de 2024 14:49:10 BRT"));
        }catch(ParseException e){
            e.printStackTrace();
        }

        
        
        
        

    }
}
