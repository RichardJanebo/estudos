package devdojo.javacore.Ycolecoes.test;

import devdojo.javacore.Ycolecoes.dominio.SmartPhoone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        SmartPhoone smartPhoone1 = new SmartPhoone("1AB2", "Iphone");
        SmartPhoone smartPhoone2 =  new SmartPhoone("1AB2", "Iphone");

        System.out.println(smartPhoone1.equals(smartPhoone2));
        System.out.println(smartPhoone1.getClass());
        System.out.println(smartPhoone2.getClass());

    }


}
