package devdojo.javacore.Bintroducaometotdos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private long[] salarios;

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome não pode estar em branco");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade == 0) {
            System.out.println("A idade não pode se 0");
        } else {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(long... salarios) {
        if (salarios == null) {
            System.out.println("Voce deve ter ao menos um salario");
        } else {

            this.salarios = salarios;
        }
    }

    public long[] getSalarios() {
        return salarios;
    }

    public void imprimirOsDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        for (long i : salarios) {
            System.out.println(i);
        }

        mediaSalarios();

    }

    public void mediaSalarios() {
        long soma = 0;

        for (long i : salarios) {
            soma += i;
        }
        System.out.println("Media dos salarios: " + soma / salarios.length);


    }

}
