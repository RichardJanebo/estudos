package teste09.dominio;



public class TesteNome extends Escola {
    
    private String cpf;
    
    public TesteNome(String nome, int classses, String cpf){
        super(nome, classses);
        this.cpf = cpf;
        

    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void imprime(){
        super.imprime();
        System.out.println(cpf);
    }
    
  
}
