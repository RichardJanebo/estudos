package devdojo.javacore.Oexcepition.runtime;

import javax.management.RuntimeErrorException;

public class RuntimeExcepitonTest02 {
    public static void main(String[] args) {
        try{
            System.out.println(divisao(10, 0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        
    }
    public static int divisao(int a,int b){
        if(b == 0){
            throw new RuntimeException("Argumento ilegal");
        }
        return a /b;
    }
    
}
