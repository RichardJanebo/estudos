package com.devdojo.javacore.ZZFthreads.dominio;

public class Accont {
    private int balance = 50;

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
     
}
