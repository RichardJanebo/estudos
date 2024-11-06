package devdojo.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            System.out.println(returnThread() + " Adicionou email na Lista ");
            this.emails.add(email);
            this.emails.notifyAll();

        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(returnThread() + " checking if there are emails");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) return null;
                
                System.out.println(returnThread() + " Não tem email disponivel na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(returnThread() + " Notificando que não estamos mais pegando emails");
        }
        
    }

    public String returnThread() {
        return Thread.currentThread().getName();
    }
}
