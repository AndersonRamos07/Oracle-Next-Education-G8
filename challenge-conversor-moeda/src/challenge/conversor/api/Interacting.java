package challenge.conversor.api;

import challenge.conversor.service.Conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
//import deprecated.actions.Conversor;
import deprecated.basis.DotEnv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Interacting {

    public void toRequire(String currency, //*USD
                          String currencyCode, //*
                          double value) {

        HttpClient client = HttpClient.newHttpClient();
        URI link = URI.create("https://v6.exchangerate-api.com/v6/dd9b27baec406a028b5e9953/latest/" + currency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double exchangeValue = rates.get(currencyCode).getAsDouble();

            Conversor conversor = new Conversor();
            conversor.toConvert(currency,
                                currencyCode,
                                exchangeValue,
                                value);

            System.out.println("exchangeValue: "+exchangeValue);
            System.out.println("rates: "+rates);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
