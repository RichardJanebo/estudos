package com.devdojo.javacore.ZZIjdbc.com;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


interface ExecutorServiceT{
    void dzerOi();
}

class ThreadPoolExecutors implements ExecutorServiceT{

    @Override
    public void dzerOi() {
        System.out.println("Metodo Concreto que dentro de uma classe que implementa executorService");
    }
    
}

class Executorss {
    public static ThreadPoolExecutors newFixedThreadPoolt(){
        return new ThreadPoolExecutors();
    }

}

public class conectionFactory {
    public static void main(String[] args) {
        ExecutorServiceT executorServiceT = Executorss.newFixedThreadPoolt();
        executorServiceT.dzerOi();

        ThreadPoolExecutors threadPoolExecutors = new ThreadPoolExecutors();
        threadPoolExecutors.dzerOi();


        ExecutorService executorService = Executors.newFixedThreadPool(0);
    }
}
