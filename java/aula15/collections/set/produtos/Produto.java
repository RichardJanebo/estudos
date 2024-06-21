package aula15.collections.set.produtos;

import java.util.Comparator;

public class Produto  implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int compareTo(Produto outroProduto){
        return nome.compareToIgnoreCase(outroProduto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Codigo: " + codigo + "\n" +
                "Preço: " + preco +
                "Quantidade: " + quantidade;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

}

class ComparatorPorpreco implements Comparator<Produto>{
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());

    }
}