package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimeto.Garçom;
import lanchonete.atendimeto.cozinha.Cozinheiro;

public class Restaurante {
    public static void main(String[] args) {
        Cozinheiro cook = new Cozinheiro();

        cook.cozinheiro("Marcos", 30);

        cook.adicionarComboNoBalcao();
        cook.adicionarComboNoBalcao();
        cook.adicionarSucoNoBAlcao();

        Garçom garçom = new Garçom();
        garçom.pegarPedidoNoBalcao();
        garçom.servindoMesa();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.pagarConta();

    }
}
