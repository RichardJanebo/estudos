package com.devdojo.javacore.ZZAclassesinternas.test;


class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}



public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            public void walk(){
                System.out.println("walking in the shadows");
            }
        };
        animal.walk();

        
    }
}
