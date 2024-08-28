package devdojo.javacore.Pwrapper;

import java.util.List;


public class WrapperTeste01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortp = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'd';
        boolean booleanP = true;


        //AltoBoxing
        Byte byteW = 1;   
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'd';
        Boolean booleanW = true;

        int i = intW;  //Unboxing
        
        Integer intW2 = Integer.parseInt("54321");

        Boolean verdadeiro = Boolean.parseBoolean("false");


        System.out.println(verdadeiro);

        String nome = "Richard";

        System.out.println(nome.toLowerCase());


        System.out.println(intW2 + 10);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('a'));

        System.out.println(Character.isLetterOrDigit('!'));

        



    }
}
