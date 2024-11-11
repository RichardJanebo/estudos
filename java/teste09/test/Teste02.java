package teste09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Teste02 {
    private static ExecutorService pool = Executors.newFixedThreadPool(10);

    private static Callable<String> getData(final int index, final int time){
        return new Callable<String>() {

            @Override
            public String call() throws Exception {
                Thread.sleep(time);
                System.out.println(Thread.currentThread().getName());
                return "Teste " + index; 
            }
            
        };
    }

    

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Processors = "+ Runtime.getRuntime().availableProcessors());
        long start = System.nanoTime();
        Callable<String> c1 = getData(0, 5000);
        Callable<String> c2 = getData(1, 5000);
        Future<String> f1 = pool.submit(c1);
        Future<String> f2 = pool.submit(c2);
        System.out.println(f1.get());
        System.out.println(f2.get());
        long end = System.nanoTime();

        System.out.println("Tempo Corrido (segundos) = " + ((end - start)/1.0E9));
        pool.shutdown();

        
    }
}
