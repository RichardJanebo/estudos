package com.devdojo.javacore.Rdatas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste {

   

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(localDate);

    }
}
