package devdojo.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover {


    @Override
    public void load(){
        System.out.println("Carregando dados por arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo do sisteme");        
    }
    

    public static void retriteveMaXDataSize(){
        System.out.println("Dentro da classe");
    }

}
