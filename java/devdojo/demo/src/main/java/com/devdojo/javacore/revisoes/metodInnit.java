package com.devdojo.javacore.revisoes;

import com.devdojo.javacore.ZZIjdbc.reposiitory.ProducerRepository;
import com.devdojo.javacore.revisoes.model.ProducerRevisao;
import com.devdojo.javacore.revisoes.saveProduce.SaveProducer;

public class metodInnit {
    public static void main(String[] args) {
        ProducerRevisao  user = new ProducerRevisao("Marcos");
        SaveProducer.save(user);
    }
}
