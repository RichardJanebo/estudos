package aula15.collections.set.contato;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;


    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public int geNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero= numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n Numero: " + numero;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }
}
