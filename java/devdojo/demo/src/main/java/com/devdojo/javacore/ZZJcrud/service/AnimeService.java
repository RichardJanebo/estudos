package com.devdojo.javacore.ZZJcrud.service;

import java.nio.channels.Pipe.SourceChannel;
import java.util.List;
import java.util.Scanner;

import com.devdojo.javacore.ZZJcrud.dominio.Anime;
import com.devdojo.javacore.ZZJcrud.dominio.Producer;
import com.devdojo.javacore.ZZJcrud.repository.AnimeRepository;
import com.devdojo.javacore.ZZJcrud.repository.ProducerRepository;

public class AnimeService {
    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                save();
                break;
            case 3:
                delete();
                break;
            case 4:
                update();
                break;
            default:
                throw new IllegalArgumentException("Not a Valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Anime> producers = AnimeRepository.findByName(name);

        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", producers.get(i).getId(),producers.get(i).getName());
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime:");
        String name = scanner.nextLine();
        System.out.println("Type the number of episodes");
        Integer episodes = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the id of Producer");
        Integer idProducer = Integer.parseInt(scanner.nextLine());

        AnimeRepository.save(Anime.builder()
            .name(name)
            .episodes(episodes)
            .producer(Producer.builder().id(idProducer).build())
            .build());

    }
    
    private static void delete() {
        System.out.println("delete by name:");
        String name = scanner.nextLine();
        AnimeRepository.delete(Anime.builder().name(name).build());

    }

    private static void update() {
        System.out.println("which indice of to name update");
        Integer indice = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("write another name");
        String outhername = scanner.nextLine();

        AnimeRepository.update(indice,outhername);

    }
    

   
}