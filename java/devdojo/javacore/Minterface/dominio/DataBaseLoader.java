package devdojo.javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader , DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco");
        
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco");
    }
    
}
