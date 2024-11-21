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
import com.devdojo.javacore.ZZIjdbc.reposiitory.ProducerRepository;
import com.devdojo.javacore.ZZIjdbc.service.ProducerService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class ConnectionFactoryTest {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080),0);
        httpServer.createContext("/name", new NameHandler());

        httpServer.setExecutor(null);
        httpServer.start();
        

       
    }

    static class NameHandler implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            List<Producer> pList = ProducerService.findByName("Mar");
            String response = pList.toString();
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
        
    }
    
}


