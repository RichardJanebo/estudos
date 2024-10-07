package teste09.dominio;

public class InterfaceTeste01  extends ClasseComConstrutor01{
    private int numero ;
    private long id;

    public InterfaceTeste01(String nome, int numero){
        super( nome);
        this.numero = numero;

    }

    public InterfaceTeste01(String nome, int numero, long id){
        this(nome, numero);
        this.id = id;
    }
    
} 
    

