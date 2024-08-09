package devdojo.javacore.Kenun.dominio;
public class Cliente {
    public enum TipoPagamento{
        CREDITO,
        DEBITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private TipoDiaDaSemana tipoDiaDaSemana;

    public Cliente(String nome,TipoCliente tipoCliente,TipoPagamento tipoPagamento,TipoDiaDaSemana tipoDiaDaSemana){
    
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.tipoDiaDaSemana = tipoDiaDaSemana;
    }

    public String toString(){
        return "Nome: " + nome + " Tipo CLiente: " + tipoCliente.getValor() + " Tipo do pagamento: " + tipoPagamento + "Dias da semana" + tipoDiaDaSemana.getValor();
    }
}