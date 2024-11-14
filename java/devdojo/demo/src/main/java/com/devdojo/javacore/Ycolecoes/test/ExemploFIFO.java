package com.devdojo.javacore.Ycolecoes.test;

import java.util.Deque;
import java.util.ArrayDeque;

public class ExemploFIFO {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        while (!pilha.isEmpty()) {
            System.out.println("Processando: " + pilha.pop());
        }
    }
}
