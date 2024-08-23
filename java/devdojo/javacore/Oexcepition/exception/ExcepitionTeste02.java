package devdojo.javacore.Oexcepition.exception;

import java.io.File;
import java.io.IOException;

public class ExcepitionTeste02 {
    public static void main(String[] args) {
        
        criarNovoArquivo();
    }

    private static void criarNovoArquivo()  {
        try{
            File file = new File("devdojo\\arquivo\\text.txt");
        boolean isCriado = file.createNewFile();
        System.out.println("Aquivo foi criado" + isCriado);
        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Algo de errado não esta certo");
        }
        

    }

}