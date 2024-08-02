package teste09.dominio;

public class Dono {
    private String nome;
    private Carro carro;



    public Dono(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void imprimir(){
        System.out.println(nome);
        if(carro != null){
            System.out.println(carro.getNome());
        }
    }



    
}
