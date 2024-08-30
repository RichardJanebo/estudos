package devdojo.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        
        String nome = "Richard"; //String constant pull

        nome = nome.concat("Sobre nome");

        String nome2 = "Richard";

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Richard");
        System.out.println(nome3.intern() == nome2);


    }

    

}
