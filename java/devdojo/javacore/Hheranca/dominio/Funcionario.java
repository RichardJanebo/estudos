package devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estatico de funcionario 2");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    
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

    public void relartorio(){
        System.out.println("Eu " + this.nome + "Recebi o Salario de " + this.salario);
    }

    
}
