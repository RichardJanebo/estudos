package lanchonete.atendimeto;

public class Garçom {
    

    void trocarGas(){
        System.out.println("GAS TROCADO");
    }

    private void pegarLancheNaCozinha(){
        System.out.println("PENGANDO LANCHE NA COZINHA");
    }

    public void pegarPedidoNoBalcao(){
        System.out.println("PEGANDO PEDIDO NO BALCÃO");
    }

    public void servindoMesa(){
        pegarLancheNaCozinha();
        System.out.println("SERVINDO A MESA");
    }



}
