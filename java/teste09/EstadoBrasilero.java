package teste09;

public enum EstadoBrasilero {
    SAO_PAULO ("SP","São Paulo", 10),
    PIAUÍ ("PI","Piauí",26),
    MATO_GROSSO_DO_SUL ("MS","Mato Grosso do Sul",20),
    MATO_GROSSO ("MT","Mato Grosso",30),
    SANTA_CATARINA ("SC","Santa Catarina",20);


    private String sigla;
    private String estado;
    private int ibge;


    private EstadoBrasilero(String sigla,String estado, int ibge){
        this.sigla = sigla;
        this.estado = estado;
        this.ibge = ibge;
    }


    public String getEstadoMaiusculo(){
        return estado.toUpperCase();
    }

    public String getSigla(){
        return sigla;
    }

    public int getIbge(){
        return ibge;
    }
    
}
