package aula17.desafioBanco;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int  SEQUENCIAL = 1;


    private int agencia;
    private int numero;
    private double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL;
        this.saldo = 0.0;
    }

    
    public int getAgencia(){
        return agencia;
    }

    public int getNumeroCc(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;

    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor,Conta contaDestiono){
        this.sacar(valor);
        contaDestiono.depositar(valor);
        
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Agencia: %d" , this.agencia));
        System.out.println(String.format("Conta: %d" , this.numero));
        System.out.println(String.format("Saldo: %d" , this.saldo));


    }
}
