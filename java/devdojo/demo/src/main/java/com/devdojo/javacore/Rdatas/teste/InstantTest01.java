package com.devdojo.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(instant.getEpochSecond());
    }
}
