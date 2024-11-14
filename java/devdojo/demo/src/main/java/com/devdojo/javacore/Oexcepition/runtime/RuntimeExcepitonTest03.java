package com.devdojo.javacore.Oexcepition.runtime;

public class RuntimeExcepitonTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
            // System.out.println("Esccrevendo no arquivo");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Fechando o arquivo");
        }
    }
}
