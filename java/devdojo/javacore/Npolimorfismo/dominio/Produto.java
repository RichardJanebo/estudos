package devdojo.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome,double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto(){
        if(this.valor >= 15){
            this.valor += this.valor * 0.5;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + "]";
    }

    

}
