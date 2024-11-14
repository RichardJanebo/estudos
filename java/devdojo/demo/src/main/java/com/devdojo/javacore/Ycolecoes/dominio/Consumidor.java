package com.devdojo.javacore.Ycolecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor implements Comparable<Consumidor> {
    private  Long id;
    private String nome;

    public Consumidor( String nome){
        this.id = ThreadLocalRandom.current().nextLong(0,100_000) ;
        this.nome = nome;
    }


    @Override
    public String toString(){
        return "id " + id + " Nome " + nome;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Consumidor consumidor = (Consumidor) o;

        return this.id.equals(consumidor.id);
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }


    public String getNome() {
        return nome;
    }


    @Override
    public int compareTo(Consumidor o) {
        return this.getNome().compareTo(o.getNome());
    }


    
    
    

}
