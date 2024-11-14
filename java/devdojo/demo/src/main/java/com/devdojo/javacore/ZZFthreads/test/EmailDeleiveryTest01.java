package com.devdojo.javacore.ZZFthreads.test;

import javax.swing.JOptionPane;

import com.devdojo.javacore.ZZFthreads.dominio.Members;
import com.devdojo.javacore.ZZFthreads.service.EmailDeliveryService;

public class EmailDeleiveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread jiraia = new Thread(new EmailDeliveryService(members), "Jiraia");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashhi");

        jiraia.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com o seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }


    }
}
