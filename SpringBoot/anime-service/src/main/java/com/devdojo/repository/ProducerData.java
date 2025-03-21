package com.devdojo.repository;

import com.devdojo.domain.Producer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProducerData {
    private  List<Producer> PRODUCER = new ArrayList<>(List.of(
            new Producer.Builder().id(1L).name("Madhouse").build(),
            new Producer.Builder().id(2L).name("Kyoto Animation").build(),
            new Producer.Builder().id(3L).name("Bones").build(),
            new Producer.Builder().id(4L).name("Wit Studio").build(),
            new Producer.Builder().id(5L).name("Ufotable").build(),
            new Producer.Builder().id(6L).name("MAPPA").build(),
            new Producer.Builder().id(7L).name("Toei Animation").build(),
            new Producer.Builder().id(8L).name("Sunrise").build(),
            new Producer.Builder().id(9L).name("CloverWorks").build(),
            new Producer.Builder().id(10L).name("Trigger").build()
    ));

    public List<Producer> getProducers(){
        return  PRODUCER;
    }
}
