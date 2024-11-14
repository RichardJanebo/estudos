package com.devdojo.javacore.Kenun.dominio;

public class Cliente {
    

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private TipoDiaDaSemana tipoDiaDaSemana;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento, TipoDiaDaSemana tipoDiaDaSemana) {

        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.tipoDiaDaSemana = tipoDiaDaSemana;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Tipo CLiente: " + tipoCliente.getValor() + " Tipo do pagamento: " + tipoPagamento
                + "Dias da semana" + tipoDiaDaSemana.getDia();
    }
}