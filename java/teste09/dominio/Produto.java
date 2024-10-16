package teste09.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Produto  implements Comparable<Produto>{
    private String nome;
    private Double preco;
    private Long id;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public Long getId(){
        return id;
    }


    @Override
    public String toString(){
        return "Nome: " + nome+ "\n" + 
                " Preço: " + preco + " Id: " + id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o ){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Produto produto = (Produto) o;
        return this.getId().equals(produto.getId());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public int compareTo(Produto produto){
        return this.getNome().compareTo(produto.getNome());
    }

    



    

}
