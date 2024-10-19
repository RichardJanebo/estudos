package teste09.dominio;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Produto<T>  implements Comparable<Produto>{
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

    private List<T> listaDeProdutosusados;

    public void setLista(List<T> listaDeProdutosusados){
        this.listaDeProdutosusados = listaDeProdutosusados;
        usandoProduto(listaDeProdutosusados);
    }



    public void usandoProduto(List<T> lista){
        for (T t : lista) {
            System.out.println(t);
        }
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
