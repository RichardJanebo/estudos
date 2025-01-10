package com.spring_direto_das_trincheiras.anime_service.revisao;

import java.util.List;



public class ClasseG<T> {
    private List<T> classe;


    public ClasseG(List<T> classe){
        this.classe = classe;
    }

    public T buscarObjetoDisponivel(){
        T t = classe.remove(0);
        System.out.println("Pegou " +  t);
        return t;
    }
}

