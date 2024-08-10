package teste09.dominio;


public  class Escola {

    private String nome;
    private int classes;

    
    public Escola(String nome, int classses) {
        this.nome = nome;
        this.classes = classses;
    }

    public String toString(){
        return "nome" + nome;
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

    public  void  imprime() {
        System.out.println(this.nome);
        System.out.println(this.classes);
    }

}
