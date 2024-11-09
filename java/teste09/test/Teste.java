package teste09.test;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import teste09.dominio.Cliente;
import teste09.dominio.ItemPedido;
import teste09.dominio.Pedido;
import teste09.dominio.PedidoItemPair;
import teste09.dominio.Produto;

public class Teste {
    public static List<Produto> produtos = List.of(
            new Produto("P1", "Notebook", 3000.0),
            new Produto("P2", "Celular", 1500.0),
            new Produto("P3", "Tablet", 1000.0),
            new Produto("P4", "Monitor", 800.0),
            new Produto("P5", "Teclado", 150.0));
    public static List<Cliente> clientes = List.of(
            new Cliente("C1", "Alice", "São Paulo"),
            new Cliente("C2", "Bruno", "Rio de Janeiro"),
            new Cliente("C3", "Carla", "São Paulo"),
            new Cliente("C4", "Daniel", "Belo Horizonte"),
            new Cliente("C5", "Eva", "Curitiba"));
    public static List<Pedido> pedidos = List.of(
            new Pedido("O1", clientes.get(0), LocalDate.of(2024, 1, 10),
                    List.of(
                            new ItemPedido(produtos.get(0), 1),
                            new ItemPedido(produtos.get(4), 2)),
                    3300.0),
            new Pedido("O2", clientes.get(1), LocalDate.of(2024, 2, 15),
                    List.of(
                            new ItemPedido(produtos.get(1), 2),
                            new ItemPedido(produtos.get(2), 1)),
                    4000.0),
            new Pedido("O3", clientes.get(2), LocalDate.of(2024, 3, 5),
                    List.of(
                            new ItemPedido(produtos.get(3), 3),
                            new ItemPedido(produtos.get(4), 1)),
                    2450.0),
            new Pedido("O4", clientes.get(3), LocalDate.of(2024, 4, 10),
                    List.of(
                            new ItemPedido(produtos.get(0), 1),
                            new ItemPedido(produtos.get(1), 1),
                            new ItemPedido(produtos.get(4), 1)),
                    4650.0),
            new Pedido("O5", clientes.get(4), LocalDate.of(2024, 5, 20),
                    List.of(
                            new ItemPedido(produtos.get(1), 1),
                            new ItemPedido(produtos.get(3), 1)),
                    2300.0));

    public static void main(String[] args) {
        System.out.println(gerarRelatorioDeProdutos(pedidos));

    }

    public static List<RelatorioProduto> gerarRelatorioDeProdutos(List<Pedido> pedidos) {
        return pedidos.stream()
                .flatMap(pedido -> pedido.getItemPedidos().stream() // Para cada pedido, cria um stream de itemPedidos
                .map(item -> new PedidoItemPair(pedido, item)))// Cria um par com o pedido e o itemPedido
                .map(par -> new RelatorioProduto( // Transforma o par em um RelatorioProduto
                        par.getItemPedido().getProduto().getId(),
                        par.getItemPedido().getProduto().getNome(),
                        par.getItemPedido().getQuantidade(),
                        par.getPedido().getValorTotal(),
                        Set.of(par.getPedido().getCliente().getId())))
                .collect(Collectors.toList()); // Coleta os RelatorioProduto em uma lista
    }

}

class RelatorioProduto {
    String produtoId;
    String produtoNome;
    int quantidade;
    double valorTotalPago;
    Set<String> clientesUnicos;

    public RelatorioProduto(String produtoId, String produtoNome, int quantidade, double valorTotalPago,
            Set<String> clientesUnicos) {
        this.produtoId = produtoId;
        this.produtoNome = produtoNome;
        this.quantidade = quantidade;
        this.valorTotalPago = valorTotalPago;
        this.clientesUnicos = new HashSet<>(clientesUnicos);
    }

    public int getQuantidadeTotal() {
        return quantidade;
    }

    public double getValorTotalPago() {
        return valorTotalPago;
    }

    public int getClientesUnicosCount() {
        return clientesUnicos.size();
    }

    @Override
    public String toString() {
        return "RelatorioProduto [produtoId=" + produtoId + ", produtoNome=" + produtoNome + ", quantidade="
                + quantidade + ", valorTotalPago=" + valorTotalPago + ", clientesUnicos=" + clientesUnicos + "]";
    }
    

}

class RelatorioCidadeProduto {
    String cidade;
    String produtoNome;
    int quantidadeTotal;
    double valorTotalPago;
}