package devdojo.estruturasCondicionais;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        String categoria;
        int idade = 80;
        if (idade <= 17){
            categoria =  "Categoria infantil";
        }else if(idade >= 18  && idade <= 60){
            categoria =  "Jovem";
        }else{
            categoria = "Melhor Idade";
        }
        System.out.println(categoria);
    }
}
