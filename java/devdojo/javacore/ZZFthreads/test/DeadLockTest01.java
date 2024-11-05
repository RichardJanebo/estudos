package devdojo.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object loc2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread01 segurando lock1");
                System.out.println("Esperando Lock 2");

                synchronized (loc2){
                    System.out.println("Thread1 segurando loc 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (loc2){
                System.out.println("Thread01 segurando lock1");
                System.out.println("Esperando Lock 2");

                synchronized (lock1){
                    System.out.println("Thread1 segurando loc 2");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
