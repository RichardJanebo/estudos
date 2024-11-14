package com.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;

class InnerAtomicIntegerTest01 {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    void implement() {
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        InnerAtomicIntegerTest01 atomicIntegerTest01 = new InnerAtomicIntegerTest01();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicIntegerTest01.implement();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(atomicIntegerTest01.getCount());
        System.out.println(atomicIntegerTest01.getAtomicInteger());

    }
}
