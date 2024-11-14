package com.devdojo.javacore.ZZEstreams.test;

import java.util.Currency;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StremTest16 {
    public static void main(String[] args) {

        long num = 10_000_000;

        sumFor(num);
        sumStremIterate(num);
        paralelleStramIterate(num);
        sumLongStreamIterate(num);

    }

    private static void sumFor(long num) {
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + " MS");
    }

    private static void sumStremIterate(long num) {
        long result = 0;
        long init = System.currentTimeMillis();

        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + " MS");
    }

    private static void paralelleStramIterate(long num) {
        long result = 0;
        long init = System.currentTimeMillis();

        result = Stream
                .iterate(1L, i -> i + 1)
                .limit(num)
                .parallel()
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + " MS");
    }

    private static void sumLongStreamIterate(long num) {
        long result = 0;
        long init = System.currentTimeMillis();

        result = LongStream.rangeClosed(1L, num)
                .parallel()
                .reduce(0, Long::sum);

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + " MS");
    }
}
