package com.devdojo.javacore.ZZIjdbc.test;



import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.devdojo.javacore.ZZIjdbc.model.Producer;
import com.devdojo.javacore.ZZIjdbc.service.ProducerService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) throws IOException {
        Producer producer = Producer.builder()
        .name("teste")
        .id(1)
        .build();
       ProducerService.save(producer);
        log.info("Producer fond '{}'");
       
    }

    
    
}


