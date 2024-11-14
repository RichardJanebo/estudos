package com.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.devdojo.javacore.ZZGconcorrencia.service.StoreService;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService service = new StoreService();
        // searchPricesSync(service);

        // searchPriceAsyc(service);

        searchPriceAsycCompletableFuture(service);
    }

    private static void searchPricesSync(StoreService service) {
        long start = System.currentTimeMillis();
        System.out.println(service.getPriceSync("Store 1"));
        System.out.println(service.getPriceSync("Store 2"));
        System.out.println(service.getPriceSync("Store 3"));
        System.out.println(service.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();

        System.out.printf("%n Time passed to searchPrice %d%n", end - start);

    }

    private static void searchPriceAsyc(StoreService service) {
        long start = System.currentTimeMillis();
        Future<Double> priceAsyncFuture1 = service.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture2 = service.getPriceAsyncFuture("Store 2");
        Future<Double> priceAsyncFuture3 = service.getPriceAsyncFuture("Store 3");
        Future<Double> priceAsyncFuture4 = service.getPriceAsyncFuture("Store 4");
        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());

        } catch (Exception e) {
            e.printStackTrace();

        }

        long end = System.currentTimeMillis();

        System.out.printf("%n Time passed to searchPrice %d%n", end - start);
        StoreService.shutdown();
    }

    private static void searchPriceAsycCompletableFuture(StoreService service) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> priceAsyncFuture1 = service.getPriceAsyncCompetableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture2 = service.getPriceAsyncCompetableFuture("Store 2");
        CompletableFuture<Double> priceAsyncFuture3 = service.getPriceAsyncCompetableFuture("Store 3");
        CompletableFuture<Double> priceAsyncFuture4 = service.getPriceAsyncCompetableFuture("Store 4");
        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());

        } catch (Exception e) {
            e.printStackTrace();

        }

        long end = System.currentTimeMillis();

        System.out.printf("%n Time passed to searchPrice %d%n", end - start);
        StoreService.shutdown();
    }
}
