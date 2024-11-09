package teste09.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Teste {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
       Path path = Paths.get("");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Runnable runnable = ()->{
            try {
                leitorDePdf(path);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

       Future<?> future = executorService.submit(runnable);

       future.get();
       
       System.out.println("Testando");

       executorService.shutdown();
       

       
    }

    public static void leitorDePdf(Path path) throws InterruptedException{
        File file = path.toFile();

       
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(()->{
            String leitor;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                while ((leitor = bufferedReader.readLine()) != null) {
                    System.out.println(leitor);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 2, TimeUnit.SECONDS);
        
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);



    }

}
