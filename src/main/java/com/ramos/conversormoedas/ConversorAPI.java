//ConversorAPI.java (Classe para consumir a API via HttpClient - Java 11+):
        package com.ramos.conversormoedas;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {
    private static final String API_KEY = "9acaeb9f44044ad14c7cac7a"; // Substitua pela chave do Passo 1
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public Moeda converter(String de, String para, double valor) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + de + "/" + para + "/" + valor;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Erro na API: " + response.body());
        }

        return gson.fromJson(response.body(), Moeda.class);
    }
}