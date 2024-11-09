package teste09.dominio;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private String id;
    private Cliente cliente;
    private LocalDate localDate;
    private List<ItemPedido> itemPedidos;
    private double valorTotal;

    public Pedido(String id, Cliente cliente, LocalDate localDate, List<ItemPedido> itemPedidos, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.localDate = localDate;
        this.itemPedidos = itemPedidos;
        this.valorTotal = valorTotal;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    

    

}
