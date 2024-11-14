package com.devdojo.javacore.ZZFthreads.test;


class Innerthreadtest011 extends Thread {
    private char c;

    public Innerthreadtest011(char c){
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
            Innerthreadtest011 innerthreadtest01 = new Innerthreadtest011('A');
            Innerthreadtest011 innerthreadtest02 = new Innerthreadtest011('B');
            Innerthreadtest011 innerthreadtest03 = new Innerthreadtest011('C');
            Innerthreadtest011 innerthreadtest04 = new Innerthreadtest011('D');

            innerthreadtest01.start();
            innerthreadtest02.start();
            innerthreadtest03.start();
            innerthreadtest04.start();

    }
}
