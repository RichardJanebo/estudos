package devdojo.javacore.ZZFthreads.test;

class Innerthreadtest01 implements Runnable {
    private char c;

    public Innerthreadtest01(char c) {
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
public class threadtest02 {
    public static void main(String[] args) {
        Thread innerthreadtest01 = new Thread(new Innerthreadtest01('A'), "T1A");// New
        Thread innerthreadtest02 = new Thread(new Innerthreadtest01('B'), "T1B");// New
        Thread innerthreadtest03 = new Thread(new Innerthreadtest01('C'), "T1C");// New
        Thread innerthreadtest04 = new Thread(new Innerthreadtest01('D'), "T1D");// New

        innerthreadtest01.setPriority(Thread.MAX_PRIORITY);

        innerthreadtest01.start(); // Runnable
        innerthreadtest02.start(); // Runnable
        innerthreadtest03.start(); // Runnable
        innerthreadtest04.start(); // Runnable

        System.out.println("");

    }
}
