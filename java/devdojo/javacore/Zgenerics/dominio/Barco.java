package devdojo.javacore.Zgenerics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome  " + nome;
    }
    
}
