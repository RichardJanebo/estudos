package aula15.collections.desafioList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> minhasCompras;

    CarrinhoDeCompras(){
        this.minhasCompras = new ArrayList<>();
    }

    public void addItens(String item, double preco, int quantidade){
        minhasCompras.add(new Item(item, preco, quantidade));
    }

    public int exibirQuantidadeDeitens(){
        return minhasCompras.size();
    }

    public double calcularValorTotalDaCompra(){
        double valorTotal =0;

        for (Item item : minhasCompras) {
            valorTotal+=item.getPreco();
        }
        return valorTotal;
    }

    public void removerItens(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        
        for(Item t: minhasCompras){
            if(t.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(t);
            }
        }
        minhasCompras.removeAll(itensParaRemover);

    }

    public void exbirItens(){
        System.out.println(minhasCompras);
    }
    

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.addItens("banana", 2.20, 10);
        carrinhoDeCompras.addItens("pão", 5.30, 8);
        carrinhoDeCompras.addItens("Amaciante", 10.0, 1);

        System.out.println(carrinhoDeCompras.calcularValorTotalDaCompra());

        carrinhoDeCompras.exbirItens();

        carrinhoDeCompras.removerItens("banana");

        System.out.println(carrinhoDeCompras.exibirQuantidadeDeitens());

        carrinhoDeCompras.exbirItens();

    }
}
