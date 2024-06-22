package teste09;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    List<Livro> meusLivros;
    public Biblioteca(){
        meusLivros = new ArrayList<>();
    }

    public void adicionarLivros(String autor,String titulo){
        meusLivros.add(new Livro(autor, titulo));
    }

    public void exbirLivros(){
        System.out.println(meusLivros);
    }

    public List<Livro> pesquisaPorTitulo(String titulo){
        List<Livro> meusLivrosPorTitulo = new ArrayList<>();
        for(Livro livro:meusLivros){
            if(livro.getAutor().equalsIgnoreCase(titulo)){
                meusLivrosPorTitulo.add(livro);
            }
        }
        return meusLivrosPorTitulo;
    }

    
    
    
}