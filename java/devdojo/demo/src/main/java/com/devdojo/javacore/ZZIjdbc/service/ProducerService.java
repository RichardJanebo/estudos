package com.devdojo.javacore.ZZIjdbc.service;

import java.util.List;

import com.devdojo.javacore.ZZIjdbc.model.Producer;
import com.devdojo.javacore.ZZIjdbc.reposiitory.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(Producer producer){
        ProducerRepository.delete(producer);
    }
    public static void update(Producer producer){
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll(){
       return ProducerRepository.findAll();
    }
    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName( name);
    }


}
