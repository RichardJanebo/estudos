package teste09.dominio;

public class PedidoItemPair {
    private Pedido pedido;
    private ItemPedido itemPedido;

    public PedidoItemPair(Pedido pedido, ItemPedido itemPedido) {
        this.pedido = pedido;
        this.itemPedido = itemPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    

    
}
