package devdojo.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localUsa = Locale.of("en", "US");
        Locale localIndia = Locale.of("hi", "IN");

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localUsa);
        Calendar calendar = Calendar.getInstance();
        System.out.println(df1.format(calendar.getTime()));

        System.out.println(df2.format(calendar.getTime()));


        System.out.println(localIndia.getDisplayCountry(localUsa));

    }
}
