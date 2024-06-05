package aula07;

public class Pessoa {
    private String name;
    private int idade;
    private String cpf;
    private String endereço;



    public Pessoa(String endereço, int idade,String cpf,String name){
        this.endereço = endereço;
        this.idade = idade;
        this.cpf = cpf;
        this.name = name;
    }

    

    public String getName(){
        return name;
    }

    public String getEndereço(){
        return endereço;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }
}
