package aula15.collections.list.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivros {
    private List<Livro> meusLivros;

    public CatalagoDeLivros() {
        this.meusLivros = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int ano) {
        meusLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!meusLivros.isEmpty()) {

            for (Livro l : meusLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

            
        }
            return livrosPorAutor;
        

    }

    public List<Livro> pesquisaPorLivrosPeriodoTempo(int anoInicial, int anoFinal) {
        List<Livro> livrosPorEpoca = new ArrayList<>();
        if(!meusLivros.isEmpty()){
            for (Livro l : meusLivros) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosPorEpoca.add(l);
                }
            }
            return livrosPorEpoca;
        }else{
            return livrosPorEpoca;
        }
        
        
    }

    public Livro pesquisarLivrosPorTitulo(String autor){
        Livro livrosPorTitulo = null;

        if(!meusLivros.isEmpty()){
            for(Livro l:meusLivros){
                if(l.getTitulo().equalsIgnoreCase(autor));
                livrosPorTitulo=l;
                break;
            }
        }

        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoDeLivros catalagoDeLivros = new CatalagoDeLivros();

        catalagoDeLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalagoDeLivros.adicionarLivros("Livro 2", "Autor 2", 2021);
        catalagoDeLivros.adicionarLivros("Livro 3", "Autor 3", 2022);
        catalagoDeLivros.adicionarLivros("Livro 4", "Autor 4", 2023);
        catalagoDeLivros.adicionarLivros("Livro 5", "Autor 2", 2024);
        catalagoDeLivros.adicionarLivros("Livro 6", "Autor 6", 2025);

        System.out.println(catalagoDeLivros.pesquisarLivrosPorAutor("Autor 2"));
        System.out.println("------------------------------------------------------");

        System.out.println(catalagoDeLivros.pesquisaPorLivrosPeriodoTempo(2021, 2024));
        System.out.println("------------------------------------------------------");
        System.out.println(catalagoDeLivros.pesquisarLivrosPorTitulo("Livro 6"));


    }

}
