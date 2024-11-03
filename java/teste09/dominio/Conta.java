package teste09.dominio;

public class Conta {
    private int saldo = 1000;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int sacar(int valor){
        return saldo -= valor;
    }


}
