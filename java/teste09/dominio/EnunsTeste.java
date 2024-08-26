package teste09.dominio;

public enum EnunsTeste {
    SEGUNDA(0),
    TERCA(1),
    QUARTA(2),
    QUINTA(3),
    SEXTA(4),
    SABADO(5),
    DOMINGO(6);


    int numero;
    private EnunsTeste(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
}
