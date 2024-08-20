package devdojo.javacore.Oexcepition.runtime;

public class RuntimeExcepitonTest01 {
    public static void main(String[] args) {
       int [] numeros = {20,3,4};

       
       try {
        System.out.println(numeros[6]);
       } catch (Exception e) {
        System.out.println(e);
       }
       
    }
}
