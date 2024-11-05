package teste09.dominio;

public class Conta {
    private String proprientario;
    private int saldo;
    private String estado;

    public Conta(String proprientario, int saldo) {
        this.proprientario = proprientario;
        this.saldo = saldo;
    }
    

    public Conta(String proprientario, int saldo, String estado) {
        this(proprientario, saldo);
        this.estado = estado;
    }

    


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int sacar(int valor){
        return saldo -= valor;
    }


    public String getProprientario() {
        return proprientario;
    }


    public String getEstado() {
        return estado;
    }



}
