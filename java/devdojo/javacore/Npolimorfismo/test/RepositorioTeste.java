package devdojo.javacore.Npolimorfismo.test;

import devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import devdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioArquivo();
        repositorioBancoDeDados.salvar();
        
    }
}
