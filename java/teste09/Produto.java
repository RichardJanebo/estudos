package teste09;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;


    public Produto(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Codigo " + codigo;
    }

    public int compareTo(Produto obj){
        return Integer.compare(codigo, obj.getCodigo());
    }



    
}

class ComparadorPornome implements Comparator<Produto>{
    @Override
    public int compare(Produto produto1, Produto produto2){
        return Integer.compare(produto1.getCodigo(), produto2.getCodigo());
    }   
}
