package com.devdojo.javacore.Ycolecoes.test;

import com.devdojo.javacore.Ycolecoes.dominio.SmartPhoone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        SmartPhoone smartPhoon1 = new SmartPhoone("Motorola", "AB36dGS");
        SmartPhoone smartPhoon2 = new SmartPhoone("Motorola", "AB36GS");


        System.out.println(smartPhoon1.equals(smartPhoon2));
        System.out.println(smartPhoon1.hashCode());

         

    }


}
