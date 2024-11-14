package com.devdojo.javacore.Zgenerics.servico;

import java.util.List;

import com.devdojo.javacore.Zgenerics.dominio.Carro;

public class VeiculoRentavelService<T> {
    private List<T> objetosDisponiveis;

    public VeiculoRentavelService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }


    public T buscarObjetoDisponiveis() {
        System.out.println("Buscando caro Dispooniveis");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro" + t);
        System.err.println("Carros disponiveis para alugar");
        System.err.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo Carro " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(objetosDisponiveis);
    }
}
