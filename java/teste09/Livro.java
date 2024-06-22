package teste09;
public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo , String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Autor: " + autor + "Titulo: " + titulo;
    }
    

}
