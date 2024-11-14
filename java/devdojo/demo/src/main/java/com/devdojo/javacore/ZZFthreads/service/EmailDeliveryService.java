package com.devdojo.javacore.ZZFthreads.service;

import com.devdojo.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Startong to deliver emails...");

        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String retriveEmail = members.retriveEmail();
                if(retriveEmail == null) continue;
                System.out.println(threadName + " Enviando email para " +  retriveEmail);
                Thread.sleep(2000);
                System.out.println(threadName + " Enviou com sucesso para " +  retriveEmail);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os emails foram enviados com sucesso");
    }

}
