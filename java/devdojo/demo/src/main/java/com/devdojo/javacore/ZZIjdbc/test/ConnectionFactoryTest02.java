package com.devdojo.javacore.ZZIjdbc.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.devdojo.javacore.ZZIjdbc.model.Producer;
import com.devdojo.javacore.ZZIjdbc.service.ProducerService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) throws IOException {
        List<Producer> producers = new ArrayList<>();
        Producer producer01 = Producer.builder()
                .name("Rafael")
                .id(1)
                .build();

        Producer producer02 = Producer.builder()
                .name("Donatelo")
                .id(1)
                .build();

        Producer producer03 = Producer.builder()
                .name("Leonardo")
                .id(1)
                .build();

        producers.add(producer01);
        producers.add(producer02);
        producers.add(producer03);


        ProducerService.saveTrasaction(producers);
        log.info("Producer fond '{}'");

    }

}
