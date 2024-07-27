package devdojo.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "Lucas";
        nomes[1] = "Beatriz";
        nomes[2] = "Gohan";

        System.out.println(nomes.length);
        for (int i = 0;i < nomes.length; i++){
            System.out.println(nomes[i] + " Indice " + i);
        }




    }
}
