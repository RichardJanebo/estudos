package teste09.test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Teste02 {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(URI.create("https://api.adviceslip.com/advice"))
            .build();

        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString());
        response.thenApply(HttpResponse::body)
            .thenAccept(responseBody -> {
                System.out.println(responseBody);
            })
            .exceptionally(ex -> {
                System.err.println("Erro: " + ex.getMessage());
                return null;
            })
            .join();  // Aguarda o término da requisição
    }
}
