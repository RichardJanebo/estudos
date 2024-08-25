package devdojo.javacore.Oexcepition.runtime;

import java.io.IOException;

public class RuntimeExcepitonTest02 {
    public static void main(String[] args) {
        try{
            System.out.println(divisao(10, 0));
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
        
    }

    public static int divisao(int a,int b) throws IOException{
        if(b == 0){
            throw new RuntimeException("Argumento ilegal");
        }
        return a /b;
    }
    
}
