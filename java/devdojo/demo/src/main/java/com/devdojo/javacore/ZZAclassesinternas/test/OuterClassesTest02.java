package com.devdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {

    private String name = "Midorya";

    void print() {
        final
         String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
