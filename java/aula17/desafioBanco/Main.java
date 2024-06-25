package aula17.desafioBanco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPolpança();

        cc.imprimirExtrato();
    }
}
