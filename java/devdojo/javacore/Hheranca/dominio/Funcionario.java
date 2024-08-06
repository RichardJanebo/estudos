package devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    
    public void imprimer(){
        super.imprime();
        System.out.println(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
