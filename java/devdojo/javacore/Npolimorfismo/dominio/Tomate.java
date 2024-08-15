package devdojo.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        if (this.valor >= 10) {
            this.valor += this.valor * 0.1;
        }
        return valor;
    }

}
