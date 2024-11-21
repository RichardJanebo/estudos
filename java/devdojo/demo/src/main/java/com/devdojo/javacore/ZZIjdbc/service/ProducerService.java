package com.devdojo.javacore.ZZIjdbc.service;

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
}
