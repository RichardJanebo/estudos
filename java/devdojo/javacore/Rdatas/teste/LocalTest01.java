package devdojo.javacore.Rdatas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {

        Locale locale = Locale.of("it", "IT");
        Locale localeCH = Locale.of("ch", "CH");


        Calendar calendar = Calendar.getInstance();
    

        
        DateFormat dateFormat1 =  DateFormat.getDateInstance(DateFormat.FULL,locale);

        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println(dateFormat1);


        System.out.println("Suiça" +   dateFormat2.format(calendar.getTime()));
        System.out.println("Italia " + dateFormat1.format(calendar.getTime()));

    }
}
