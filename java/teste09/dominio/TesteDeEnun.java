package teste09.dominio;

public enum TesteDeEnun {
    SEGUNDA(1),
    TERÇA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    int valor ;

    public int getValor(){
        return valor;
    }

    TesteDeEnun(int valor){
        this.valor = valor;
    }
}
