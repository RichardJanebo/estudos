package devdojo.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000, Month.APRIL, 6);

        Instant instant = Instant.now();

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    




        System.out.println(ChronoUnit.HOURS.between(localTime,instant ));



        
        System.out.println(ChronoUnit.DAYS.between(localDate, LocalDateTime.now()));

        System.out.println(ChronoUnit.MONTHS.between(localDate, LocalDate.now()));


    }
}
