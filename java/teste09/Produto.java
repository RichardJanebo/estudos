package teste09;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome,double preco){
        this.nome= nome;
        this.preco = preco;

    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }


    public String toString(){
        return "Produto{" +
        "Nome=" + nome + "-" + "Preço" + preco + "}";
        
    }

    public int compareTo(Produto outroProduto) {
        if (this.preco < outroProduto.preco) {
            return -1;
        } else if (this.preco > outroProduto.preco) {
            return 1;
        } else {
            return 0;
        }
    }

}
