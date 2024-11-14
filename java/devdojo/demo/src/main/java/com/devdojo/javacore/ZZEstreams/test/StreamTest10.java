package com.devdojo.javacore.ZZEstreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1],n[0] + n[1]})
            .limit(10)
            .forEach(a -> System.out.println(a));

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Stream.generate(() -> threadLocalRandom.nextInt(1,500)).limit(500).forEach(System.out::println);

    }
}
