package teste09.dominio;

public  class FinalRevisão01 {
    private String name;
    private final int IDADE = 10;

    public void setname(String name){
        this.name = name;
    }
    public final void imprime(){
        System.out.println("Dentro do metodo imprime");
    }
}
