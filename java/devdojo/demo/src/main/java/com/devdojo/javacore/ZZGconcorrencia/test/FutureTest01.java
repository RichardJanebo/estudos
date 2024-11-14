package com.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 4.35D;
        });
        System.out.println(doingSomething());
        Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        System.out.println(dollarResponse);
        executorService.shutdown();

    }

    private static long doingSomething(){
        System.out.println(Thread.currentThread().getName());
        long sun = 0;
        for (int i = 0; i < 1_000; i++){
            sun +=i;
        }
        return sun;
            
        
    }
}
