package br.com.cursoalura.challenge_currencyconverter.search;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchCurrency {

    public String getCurrencyConvert(String currentCurrency, String currencyToConvert, double amount){
        String address = "https://v6.exchangerate-api.com/v6/97b342ebe88368582415785d/pair/"+currentCurrency+"/"+currencyToConvert+"/"+amount;
        HttpResponse<String> response = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Programa foi executado com sucesso");
        }
        return response.body();
    }
}
