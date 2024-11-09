package devdojo.javacore.ZZGconcorrencia.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPriceAsyncFuture(String storeName) {
        System.out.printf("Getting prices async for store %s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPriceAsyncCompetableFuture(String storeName) {
        System.out.printf("Getting prices async for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public static void shutdown() {
        ex.shutdown();

    }

    private double priceGenerator() {
        delay();
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
