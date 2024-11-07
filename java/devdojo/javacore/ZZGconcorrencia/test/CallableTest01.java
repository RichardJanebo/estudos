package devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

class InnerCallableTest01 implements Callable<String>{

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(0,11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s execultando uma tarefa callable...%n",Thread.currentThread().getName());

        }

        return String.format("%s finished and the random number is %d",Thread.currentThread().getName(),num);
    }

    
}
public class CallableTest01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        InnerCallableTest01 innerCallableTest01 = new InnerCallableTest01();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        Future<String> submit = newFixedThreadPool.submit(innerCallableTest01);
        String s = submit.get();
        System.out.println(s);
        System.out.println("Programa finished");
        newFixedThreadPool.shutdown();
    }
    
}
