package devdojo.javacore.Rdatas.teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TemporalAjusterTeste {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(ChronoField.DAY_OF_MONTH, 20);
        
    

        localDate = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(localDate);



    }
    
}
