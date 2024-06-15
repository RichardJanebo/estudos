package desafioControleDeFluxo;
import java.util.Scanner;
public class DesafioControleDefluxo {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Você terá que digitar 2 numeros de modo que o primeiro seja menor que o segundo");
        System.out.println("Digite o primeiro");
        int numero1 = dataInput.nextInt();
        System.out.println("Agora digite o segundo numero:");
        int numero2 = dataInput.nextInt();
        dataInput.close();


        try{
            AnalisandoDados p =new AnalisandoDados();
            p.AnaliseDeDados(numero1,numero2);
            int total = p.retornoDeDados();

            for (int indice = 1;indice <= total;indice++) {
                System.out.println("Numero: " + indice);
            }
           

        }catch(RuntimeException e) {
            System.out.print(e.getMessage());
        }


    }
    
}
