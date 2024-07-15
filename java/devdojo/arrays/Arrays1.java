package devdojo.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Pablo";
        nomes[1] = "João";
        nomes[2] = "Silva";

        for (int i = 0; i < nomes.length ; i++) {
            if(i == 8){
                break;
            }
            System.out.println(nomes[i]);
         
        }
    }

}