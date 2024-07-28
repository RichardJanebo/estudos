package devdojo.javacore.Bintroducaometotdos.dominio;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(12 - 2);
    }

    public int multplicaDoisNumeros(int n  , int x){
       return n * x;
    }

    public void dividirDoisNumeros(float n , float x){
        
        if(n == 0 || x ==0){
            System.out.println("Os numeros não podem ser 0");
        }else{
            System.out.println(n / x);
        }
    }

    public void testeDeNumeros(int n){
        if(n ==0){
            System.out.println("O Numero não pode ser 0");
            return;
        }

        System.out.println(n);
    }

    public int alteraDoisNumeros(int numero1, int numero2){
        
        numero1 = 99;
        
        numero2 = 33;
        return numero1 + numero2;
        
    }

    



    


}
