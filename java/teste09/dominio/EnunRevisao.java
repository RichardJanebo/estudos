package teste09.dominio;

public enum EnunRevisao {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    SOMINGO(7);

    int n;
    private EnunRevisao(int n){
        this.n = n;
    }

    public int getN(){
        return n;
    }
}
