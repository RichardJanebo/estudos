package devdojo.arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int [][]dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;


//        for(int i = 0; i < dias.length; i++ ){
//            for(int e = 0; e < dias[i].length; e++){
//                System.out.println(dias[i][e]);
//            }
//
//        }

        for(int[] i:dias){
            for(int e:i){
                System.out.println(e);
            }
        }

    }
}
