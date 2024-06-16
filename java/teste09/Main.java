package teste09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3000.00));
        produtos.add(new Produto("Smartphone", 1500.00));
        produtos.add(new Produto("Tablet", 2000.00));
        produtos.add(new Produto("Monitor", 800.00));

        // Exibindo a lista antes da ordenação
        System.out.println("Lista de produtos antes da ordenação:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Ordenando a lista de produtos pelo preço
        Collections.sort(produtos);

        // Exibindo a lista após a ordenação
        System.out.println("\nLista de produtos após a ordenação:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
