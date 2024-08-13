package teste09.dominio;


public  class Escola {

    private String nome;
    private int classes;
    private String tipo;

    public void init(String nome , int classes){
        this.nome = nome;
        this.classes = classes;
    }

    public void init(String nome, int classes, String tipo){
        this.init(nome, classes);
        this.tipo = tipo;
        
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getClasses() {
        return classes;
    }
    public void setClasses(int classes) {
        this.classes = classes;
    }

   

}
