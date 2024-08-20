package devdojo.javacore.Oexcepition.exception;

import java.io.File;
import java.io.IOException;

public class ExcepitionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("devdojo\\arquivho\\teste.txt");
        try{ 
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+ isCriado);

        }catch(IOException e){
            e.printStackTrace();
        }


        
    }
    
}