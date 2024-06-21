package aula15.collections.set.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
    Set<Produto> meuProdutos;
    public CadastroDeProdutos(){
        meuProdutos = new HashSet<>();
    }

    public void addProdutos(String nome, int codigo, double preco, int quantidade){
        meuProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exiProdutosPorNome(String nome){
        Set<Produto> produtosPorNome = new TreeSet<>(meuProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPorpreco());
        produtosPorpreco.addAll(meuProdutos);
        return produtosPorpreco;
    }
    

    
}
