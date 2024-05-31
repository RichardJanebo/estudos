import java.util.Calendar;

public class Cadastro {
    Calendar c = Calendar.getInstance();
    String nome ;
    int dataDeNascimento ;
    int idade ;
    String telefone ;

    public void setDataDeNascimento(int dataDeNascimento) {
        int dataAtual = c.get(Calendar.YEAR);
        this.idade =   dataAtual - dataDeNascimento;
        
        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String tell){
        this.telefone = tell;
    }
    
    
}
