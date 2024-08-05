package teste09.dominio;

public class Escola {
    public void somar(int[] numeros){
        int soma = 0;
        for(int i :numeros){
            soma += i;
        }
        System.out.println(soma);
    }
}
