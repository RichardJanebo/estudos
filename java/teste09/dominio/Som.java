package teste09.dominio;

public interface Som {
    int SOM_DO_ANIMAL_DECIBEIS = 10;
    void emitirsom();

    default void concretMethod(){
        System.out.println("Metodo Concreto3");
    }

    
}
