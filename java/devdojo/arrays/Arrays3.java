package devdojo.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        int[] numeros2 = {2,3,4,5};

        int []numeros3 = new int[]{1,2,3,3,3};


//         for (int i = 0; i < numeros3.length;i++){
//            System.out.println(numeros3[i]);
//        }

        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
