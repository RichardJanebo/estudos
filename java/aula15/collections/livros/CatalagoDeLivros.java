package aula15.collections.livros;

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

            return livrosPorAutor;
        }else{
            return livrosPorAutor;
        }

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

}
