package com.devdojo.javacore.ZZIjdbc.com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class conectionFactory {

    public static void main(String[] args) {
        System.out.println("Programa rodando normalmente");

        ExecutorService executor = Executors.newCachedThreadPool();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.adviceslip.com/advice"))
                .build();

        CompletableFuture<HttpResponse<String>> resposta = CompletableFuture.supplyAsync(() -> {
            try {
                return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            } catch (Exception e) {
                throw new RuntimeException("Falha na requisição", e);
            }
        }, executor);

        resposta.thenAccept(response -> {
            System.out.println("Requisição feita com sucesso.");
            System.out.println("Status: " + response.statusCode());
            System.out.println("Corpo da requisição: " + response.body());
        }).exceptionally(exe -> {
            exe.printStackTrace();
            return null;
        });

        executor.shutdown();

    }

}