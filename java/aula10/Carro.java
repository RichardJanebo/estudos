package aula10;

public class Carro extends Veiculo {

    
    public void ligar(){
        conferindoCambio();
        conferirOleo();
        System.out.println("LIGANDO CARRO");
    }

    private void conferirOleo(){
        System.out.println("CONFERINO OLEO");
    }

    private void conferindoCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }
     
}
