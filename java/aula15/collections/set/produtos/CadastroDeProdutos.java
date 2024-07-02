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

    public Set<Produto> exiProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(meuProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPorpreco());
        produtosPorpreco.addAll(meuProdutos);
        return produtosPorpreco;
    }
    public static void main(String[] args) {
        CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();
        cadastroDeProdutos.addProdutos("Amaciante", 20, 10, 2);
        cadastroDeProdutos.addProdutos("Nescau", 60, 9.99, 1);
        cadastroDeProdutos.addProdutos("Alho", 55, 5, 3);

        System.out.println(cadastroDeProdutos.exiProdutosPorNome());
        System.out.println("---------------------------------------");
        System.out.println(cadastroDeProdutos.exibirPorPreco());
    }
    

    
}
