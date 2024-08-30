package teste09.dominio;

public abstract class Animal {
    private String nome;
    private int patas;
    private String barulho;

    public Animal(String nome, int patas){
        if(patas == 4 ){
          throw new  ExeceptionCustomizadas();
        }
        this.nome = nome;
        this.patas = patas;
    }

    public Animal(String nome, int patas, String barulho){
        this(nome, patas);
        this.barulho = barulho;
    }

    public abstract void emitirSom();

    public void correr(){
        System.out.println("Animal esta correndo");
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Tem " + patas + " patas " + " E faz esse Barulho " + barulho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    


    
}
