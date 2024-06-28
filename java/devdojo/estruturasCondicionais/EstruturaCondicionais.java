package devdojo.estruturasCondicionais;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean altorizado = idade >= 18;

        if(altorizado || idade == 15){
            System.out.println("Altorizado pois a idade é: " + idade);
        }else{
            System.out.println("Negado pois a idade é: " + idade );
        }


        if (altorizado) {
            System.out.println("Condição verdadeira");
        }
        if(!altorizado){
            System.out.println("Condição falsa");
        }
        System.out.println("Fora Do if");
    }
}
