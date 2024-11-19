package com.devdojo.javacore.ZZIjdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.devdojo.javacore.ZZIjdbc.dominio.Producer;
import com.devdojo.javacore.ZZIjdbc.reposiitory.ProducerRepository;

public class ConectionFactory01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        Producer producer = new Producer(nome);
        ProducerRepository.save(producer);
        scanner.close();
    }
    
}