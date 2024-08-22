package devdojo.javacore.Kenun.dominio;

public enum TipoDiaDaSemana {
    DOMINGO(0,"Domingo"),
    SEGUNDA(1,"Segunda"),
    TERÇA(2,"Terça"),
    QUARTA(3,"Quarta"),
    QUINTA (4,"Quinta"),
    SEXTA  (5,"Sexta"),
    SABADO(6,"Sabado");


    private int valor;
    private String dia;
    
    TipoDiaDaSemana(int valor,String dia){
        this.valor = valor;
        this.dia = dia;
    }

    public TipoDiaDaSemana valuses(String nome){
        for(TipoDiaDaSemana tipoDiaDaSemana:values()){
            if(tipoDiaDaSemana.getDia().equalsIgnoreCase(nome)){
                return tipoDiaDaSemana;
            }
        }
        return null;

    }

    public static TipoDiaDaSemana  tipoClientePorNomeRelatorio(String nome){
        for(TipoDiaDaSemana tipoDia: values()){
            if(tipoDia.getDia().equals(nome)){
                return tipoDia;
            }
        }
        return null;
    }

    public String getDia(){
        return dia;
    }

    public int getValor(){
        return valor;
    }
}
