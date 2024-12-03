package com.devdojo;

import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) {
        Set<Pessoa> pessoas = new LinkedHashSet<>();
        pessoas.add(new Pessoa.Builder().name("Larrissa").age(5).build());
        pessoas.add(new Pessoa.Builder().name("Cornelhos").age(65).build());
        pessoas.add(new Pessoa.Builder().name("Harry").age(18).build());
        pessoas.add(new Pessoa.Builder().name("Soluço").age(26).build());
        pessoas.add(new Pessoa.Builder().name("Goku").age(42).build());

        pessoas.forEach(System.out::println);

        
    }

}

class Pessoa implements Comparable<Pessoa> {
    private String id;
    private String name;
    private int age;

    private Pessoa(String name, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(name, age);
        }
    }

    @Override
    public int compareTo(Pessoa o) {

        if (this.getAge() < o.getAge()) {
            return -1;
        } else if (this.getAge() == o.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() +
                " Nome: " + this.getName() +
                " Idade: " + this.getAge();
    }

    

}
