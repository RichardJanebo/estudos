package devdojo.javacore.Oexcepition.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import devdojo.javacore.Oexcepition.dominio.Leitor1;
import devdojo.javacore.Oexcepition.dominio.Leitor2;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
        
    }

    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                if (reader != null) {
                    
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
