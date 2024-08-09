package devdojo.javacore.Kenun.test;

import devdojo.javacore.Kenun.dominio.Cliente;
import devdojo.javacore.Kenun.dominio.TipoCliente;
import devdojo.javacore.Kenun.dominio.TipoDiaDaSemana;
import devdojo.javacore.Kenun.dominio.Cliente.TipoPagamento;

public class ClienteTeste01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Macos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO,TipoDiaDaSemana.DOMINGO);


        System.out.println(cliente1);
        
    }   
}
