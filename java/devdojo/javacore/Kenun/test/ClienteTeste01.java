package devdojo.javacore.Kenun.test;


import devdojo.javacore.Kenun.dominio.TipoDiaDaSemana;
import devdojo.javacore.Kenun.dominio.TipoPagamento;

public class ClienteTeste01 {

    public static void main(String[] args) {
        // Cliente cliente1 = new Cliente("Macos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO,TipoDiaDaSemana.DOMINGO);


        // System.out.println(cliente1);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoDiaDaSemana tipoDiaDaSemana = TipoDiaDaSemana.tipoClientePorNomeRelatorio("Domingo");
        System.out.println(tipoDiaDaSemana);

        System.out.println(tipoDiaDaSemana.valuses("segunda-feira"));
        
    }   
}
