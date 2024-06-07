package aula10;

public abstract class Veiculo {
    private String chassi;

    public void setchassi(String chassi){
        this.chassi = chassi;
    }

    public String getChassi(){
        return chassi;
    }

    public abstract void ligar();
}
