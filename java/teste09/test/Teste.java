package teste09.test;

import teste09.dominio.Conta;

public class Teste implements Runnable {

    private static Conta conta = new Conta();

    public static void main(String[] args) {
        Teste teste = new Teste();

        Thread t1 = new Thread(teste, "Maria");
        Thread t2 = new Thread(teste, "Alex");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        usandoConta(100);
    }

    private static synchronized  void usandoConta(int valor) {
        if (conta.getSaldo() >= valor) {
            for (int i = 0; i < 10; i++) {

                System.out.println(getCurrentThread() + " Sacando Diinheiro");
                System.out.println("--------------------------");
                conta.sacar(valor);
                System.out.println(getCurrentThread() + "Saldo restante: " + conta.getSaldo());
            }
        } else {
            System.out.println("Saldo insulficiente " + conta.getSaldo());
        }
    }

    private static String getCurrentThread() {
        return Thread.currentThread().getName();
    }

}
