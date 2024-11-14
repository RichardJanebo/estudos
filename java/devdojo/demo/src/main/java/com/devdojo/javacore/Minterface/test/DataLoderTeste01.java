package com.devdojo.javacore.Minterface.test;

import com.devdojo.javacore.Minterface.dominio.DataBaseLoader;
import com.devdojo.javacore.Minterface.dominio.DataLoader;
import com.devdojo.javacore.Minterface.dominio.DataRemover;
import com.devdojo.javacore.Minterface.dominio.FileLoader;

public class DataLoderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();


        System.out.println("------------------------------");

        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println("----------------------------------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        
        System.out.println("----------------------------------");

        FileLoader.retriteveMaXDataSize();
        DataLoader.retriteveMaXDataSize();
        
    }
}
