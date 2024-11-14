package com.devdojo.javacore.ZZGconcorrencia.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPollTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static DateTimeFormatter formater =  DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper(){
        Runnable r = ()-> {
            System.out.println(LocalTime.now().format(formater)+ " beep " );
        };


        // executor.schedule(r, 5, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture=  executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        executor.schedule( () ->{System.out.println("Cancelando o scheduledFuture");
        scheduledFuture.cancel(false); },10,TimeUnit.SECONDS );


    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formater));
        beeper();

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(()->{
            System.out.println("Teste ");
        }, 0, 2, TimeUnit.SECONDS);
    }


}
