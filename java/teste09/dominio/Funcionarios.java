package teste09.dominio;

public class Funcionarios implements Comparable<Funcionarios> {
    private String nome;
    private Double idade;


    public Funcionarios(String nome, Double idade){
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getIdade() {
        return idade;
    }


    public void setIdade(Double idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Funcionarios outroFuncionario){
        return this.idade.compareTo(outroFuncionario.getIdade());
    }


    @Override
    public String toString() {
        return "Nome " + nome + " Idade " + idade + "\n";
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Funcionarios func = (Funcionarios) obj;

        return this.getNome().equals(func.getNome()) && this.getIdade() == func.getIdade();
         
        
    }


    @Override
    public int hashCode() {
       return this.getNome().hashCode() + this.idade.hashCode();
    }


    

    




    
}
