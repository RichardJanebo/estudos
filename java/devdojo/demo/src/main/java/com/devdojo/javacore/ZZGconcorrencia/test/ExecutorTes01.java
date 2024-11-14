package com.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio: %d%n" , Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finalizou%n",Thread.currentThread().getName(), num);

    }

}

public class ExecutorTes01 {
    public static void main(String[] args) {
        ExecutorService executorServiceo = Executors.newFixedThreadPool(4);
        executorServiceo.execute(new Printer(1));
        executorServiceo.execute(new Printer(2));
        executorServiceo.execute(new Printer(3));
        executorServiceo.execute(new Printer(4));
    }

}