package com.devdojo.javacore.Npolimorfismo.servico;

import com.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }

}
