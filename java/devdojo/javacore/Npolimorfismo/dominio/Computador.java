package devdojo.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public Computador(String nome,double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
