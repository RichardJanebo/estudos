package desafioControleDeFluxo;

public class AnalisandoDados {
    public int numero1 ;
    public int numero2 ;

    public void AnaliseDeDados(int i, int x){
        if(i > x){
            throw new RuntimeException("O primeiro Valor Não pode ser maior que o segundo");
        }


        this.numero1 = i;
        this.numero2 = x;

    }

    

    public int retornoDeDados(){
        
        int total = numero2 - numero1;
        return total;
    }
}
