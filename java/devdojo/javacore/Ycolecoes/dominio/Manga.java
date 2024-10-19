package devdojo.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private Double preco;
    private int quantidade;


    public Manga(long id, String nome, double preco){
        Objects.requireNonNull(id+ " Id Não pode ser nulo");
        Objects.requireNonNull(nome + " O nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    


    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }



    public Long getId() {
        return id;
    }
    


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id,nome);
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Manga manga = (Manga) obj;
        return this.getNome().equals(manga.getNome()) &&  this.getId().equals(manga.getId());
            
        
    }


    @Override
    public String toString() {
       return "Id: " + id + " Nome: " + nome + " Preço: " + preco + "Quantidade " + quantidade;
    }


    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this for menor que outro manga
        //se this for igual a o outro objeto voce retorna zero
        //Se o this for menor que o outro objeto retorna 1
        return this.nome.compareTo(outroManga.getNome());
    }





    public int getQuantidade() {
        return quantidade;
    }





    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    



    

    
}
