package devdojo.javacore.Minterface.test;

import devdojo.javacore.Minterface.dominio.DataBaseLoader;
import devdojo.javacore.Minterface.dominio.DataLoader;
import devdojo.javacore.Minterface.dominio.DataRemover;
import devdojo.javacore.Minterface.dominio.FileLoader;

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
