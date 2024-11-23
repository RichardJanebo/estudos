package com.devdojo.javacore.ZZJcrud.test;

import java.util.Scanner;

import com.devdojo.javacore.ZZJcrud.service.AnimeService;
import com.devdojo.javacore.ZZJcrud.service.ProducerService;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int op;
        boolean key = true;
        while (key) {

            System.out.println(" _________________________________");
            System.out.println("|which table do you want edit     |");
            System.out.println("|1.           Producer            |");
            System.out.println("|2.           Anime               |");
            System.out.println("|_________________________________|");
            
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0){
                key = false;
                continue;
            }

            switch (op) {
                case 1:
                    producerMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    ProducerService.buildMenu(op);
                    break;
                case 2:
                animerMenu();
                op = Integer.parseInt(scanner.nextLine());
                AnimeService.buildMenu(op);
                break;
                default:
                    System.out.println("Invaid Argument");
            }
          

            ProducerService.buildMenu(op);
        }
    }

    private static void producerMenu() {
        System.out.println(" _________________________________");
        System.out.println("|Type the number of your operation|");
        System.out.println("|1. Search for producer name      |");
        System.out.println("|2.          Save                 |");
        System.out.println("|3.          Delete               |");
        System.out.println("|4.          Update               |");
        System.out.println("|0.          exit                 |");
        System.out.println("|_________________________________|");
    }
    private static void animerMenu() {
        System.out.println(" _________________________________");
        System.out.println("|Type the number of your operation|");
        System.out.println("|1. Search for Anime name         |");
        System.out.println("|2.          Save                 |");
        System.out.println("|3.          Delete               |");
        System.out.println("|4.          Update               |");
        System.out.println("|0.          exit                 |");
        System.out.println("|_________________________________|");
    }


}
