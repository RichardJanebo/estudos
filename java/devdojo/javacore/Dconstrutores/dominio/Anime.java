package devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;


    public Anime(String nome, String tipo, int episodio, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodio, String genero,String estudio){
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }
    


    

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome(){
        return this.nome;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setEpisodio(int episodio){
        this.episodio = episodio;
    }

    public int getEpsodios(){
        return episodio;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
}
