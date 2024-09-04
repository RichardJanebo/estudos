package teste09.test;
public class SimulandoStackOverFlow {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        System.out.println("Até estourar a stack");
        while (1 == 1) {
            print();
        }
    }

}
