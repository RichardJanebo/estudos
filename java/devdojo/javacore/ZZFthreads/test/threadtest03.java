package devdojo.javacore.ZZFthreads.test;

class Innerthreadtest03 implements Runnable {
    private String c;

    public Innerthreadtest03(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

// Daemon X User
public class threadtest03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Innerthreadtest03("Ka"), "T1");
        Thread t2 = new Thread(new Innerthreadtest03("ME"));

        Thread t3 = new Thread(() -> System.out.println("Thead em funcionamento"));

        t1.start();
        t1.join(); // Não pode proceguir até a thread 1 terminar
        t2.start();

    }
}
