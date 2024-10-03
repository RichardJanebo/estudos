package devdojo.javacore.Ycolecoes.test;

import java.util.List;
import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();// 1.4
        nomes.add("Lion");
        nomes.add("King");

        for(String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("The");
        for(int i = 0; i < nomes.size();i++) {
            System.out.println(nomes.get(i));
        }       
         
    }
    
}
