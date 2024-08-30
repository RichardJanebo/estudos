package teste09.dominio;

public class Cachorro extends Animal {
    public Cachorro(String nome,int patas,String som){
        super(nome, patas, som);
    }


   public void emitirSom(){
    System.out.println("getBarulho()");
   }

}
