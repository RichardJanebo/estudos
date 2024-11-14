package com.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.devdojo.javacore.Ycolecoes.dominio.SmartPhoone;

public class SmatPhoneListTeste01 {
    public static void main(String[] args) {
        SmartPhoone smartPhoone1 = new SmartPhoone("Motorola", "354DAF8");
        SmartPhoone smartPhoone2 = new SmartPhoone("Motorola", "595DAG9");
        SmartPhoone smartPhoone3 = new SmartPhoone("SangSung", "55SDF66");

        List<SmartPhoone> smartPhoones = new ArrayList<>(6);
        smartPhoones.add(smartPhoone1);
        smartPhoones.add(smartPhoone2);
        smartPhoones.add(smartPhoone3);
        smartPhoones.add(0,smartPhoone1);


        for(SmartPhoone smartPhoone : smartPhoones){
            System.out.println(smartPhoone);
        }

        SmartPhoone smartPhoone4 = new SmartPhoone("Xiome", "595DAjG9");

        System.out.println(smartPhoones.contains(smartPhoone4));
        System.out.println(smartPhoones.indexOf(smartPhoone4));


        if(smartPhoones.indexOf(smartPhoone4) != -1){
            System.out.println(smartPhoone4.getSerialNumber());
        }
        




        

    }
}
