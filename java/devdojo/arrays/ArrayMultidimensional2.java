package devdojo.arrays;

public class ArrayMultidimensional2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][];

        arrayInt[0] = new int[]{10, 65, 80};
        arrayInt[1] = new int[4];
        arrayInt[1] = new int[]{95, 26, 23, 98};

        for (int[] teste : arrayInt) {
            System.out.println("\n--------------");
            for (int n : teste) {
                System.out.print(n + " ");
            }
        }
    }
}
