package com.devdojo.javacore.Rdatas.teste;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTeste01 {
    public static void main(String[] args) {
       


        System.out.println(new Date());
        System.out.println(
                DateFormat.getDateInstance(DateFormat.FULL, Locale.CANADA).format(Calendar.getInstance().getTime()));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.of("in", "US")).format(10_000.530));

        LocalDate date = LocalDate.of(2024, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.now();
       

        System.out.println(date.getDayOfYear());
        System.out.println(date2);

        System.out.println(date2.getDayOfMonth());
        System.out.println(date2.lengthOfMonth());
        System.out.println(date2.get(ChronoField.YEAR_OF_ERA));
        
   

        System.out.println(date);

    }

}
