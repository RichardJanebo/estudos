package devdojo.javacore.Kenun.dominio;

public enum TipoDiaDaSemana {
    DOMINGO(0),
    SEGUNDA(1),
    TERÇA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6);


    private int valor;
    
    TipoDiaDaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
