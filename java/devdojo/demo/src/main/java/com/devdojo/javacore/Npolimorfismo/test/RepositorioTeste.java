package com.devdojo.javacore.Npolimorfismo.test;

import com.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import com.devdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioArquivo();
        repositorioBancoDeDados.salvar();
        
    }
}
