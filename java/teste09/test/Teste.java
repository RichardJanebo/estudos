package teste09.test;

public class Teste {
    public static void main(String[] args) {
        try{
            System.out.println(mediaDosNumeros(new int[]{20,30,40,50,60}));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private static int mediaDosNumeros(int [] numeros){
        int soma = 0;
        for(int numero:numeros){
            soma += numero;
        }
        return soma / numeros.length;
    }
}
