package teste09.dominio;

public class Cliente {
    private String id;
    private String nome;
    private String cidade;

    public Cliente(String id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getId() {
        return id;
    }

   

    public String getNome() {
        return nome;
    }

 
    public String getCidade() {
        return cidade;
    }
 

}
