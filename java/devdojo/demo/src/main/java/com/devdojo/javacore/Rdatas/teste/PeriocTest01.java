package com.devdojo.javacore.Rdatas.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriocTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(20).plusDays(6);

        Instant instant01 = Instant.now();

        System.out.println(instant01.getNano());

        Instant instant02 = Instant.now().plusSeconds(3);

        Duration duration = Duration.between(instant01, instant02);

        Period p3 = Period.ofWeeks(60);

        System.out.println(duration);

        System.out.println(Period.between(now, now.plusDays(p3.getDays())));

        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));

        ;

    }
}
