package devdojo.javacore.ZZFthreads.test;


class Innerthreadtest01 extends Thread {
    private char c;

    public Innerthreadtest01(char c){
        this.c =c;
    }

    @Override
    public void run() {
        for(int i = 0; i < 200;i++){
            System.out.print(c);
            if (i % 100 ==0) {
                System.out.println();
            }
        }
    }

    
    
}

//Daemon X User
public class threadtest01 {
    public static void main(String[] args) {
            Innerthreadtest01 innerthreadtest01 = new Innerthreadtest01('A');
            Innerthreadtest01 innerthreadtest02 = new Innerthreadtest01('B');
            Innerthreadtest01 innerthreadtest03 = new Innerthreadtest01('C');
            Innerthreadtest01 innerthreadtest04 = new Innerthreadtest01('D');

            innerthreadtest01.start();
            innerthreadtest02.start();
            innerthreadtest03.start();
            innerthreadtest04.start();

    }
}
