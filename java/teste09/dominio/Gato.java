package teste09.dominio;

public class Gato extends InnerAnimal{
    public Gato(String nome, String som,EnunsTeste enunsTeste,String cor){
        super(nome, som,enunsTeste);
        this.cor = cor;
    }
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    

    
    

    
}
