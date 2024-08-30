package teste09.dominio;

public class ExeceptionCustomizadas extends RuntimeException  {
     public ExeceptionCustomizadas(){
        super("Esse não é um cachorro");
     }
    }