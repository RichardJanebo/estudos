package teste09.dominio;

public interface InterfaceTeste01 {
    String NOME = "Richard";

    void metodo();

    default void returnHelloWord(){
        System.out.println( "Hello word");
    }
    
}
