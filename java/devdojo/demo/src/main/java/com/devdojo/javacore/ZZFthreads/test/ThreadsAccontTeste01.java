package com.devdojo.javacore.ZZFthreads.test;

import com.devdojo.javacore.ZZFthreads.dominio.Accont;

public class ThreadsAccontTeste01 implements Runnable{
    private static Accont accont = new Accont();
    @Override
    public  void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(accont.getBalance() < 0){
                System.out.println("Lascouse");
            }
        }
    }

    public static void main(String[] args) {
        ThreadsAccontTeste01 threadsAccontTeste01 = new ThreadsAccontTeste01();
        Thread t1 = new Thread(threadsAccontTeste01 , "Hestia");
        Thread t2 = new Thread(threadsAccontTeste01 , "Bell Cranel");

        t1.start();
        t2.start();
        
    }

    private static synchronized void  withdrawal(int amout){
        if(accont.getBalance() >= amout){
            System.out.println(Thread.currentThread().getName() + " Esta indo sacar dinheiro");
            accont.withdraw(amout);
            System.out.println(Thread.currentThread().getName() + " Completou o saque , Valor atual: " + accont.getBalance());
        }else{
            System.out.println("Ta sem grana meu parceiro" + Thread.currentThread().getName() + " Efetuar o saque " + accont.getBalance());
        }

    }

}
