package challenge.conversor.api;

import challenge.conversor.service.Conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static challenge.conversor.service.Functions.toOutput;

public class Interacting {

    public void toRequire(String currency, //*USD
                          String currencyCode, //*
                          double value) {

        HttpClient client = HttpClient.newHttpClient();
        URI link = URI.create("https://v6.exchangerate-api.com/v6/2815ad07b3e2f9606a0556b3/latest/" + currency);
            //https://v6.exchangerate-api.com/v6/2815ad07b3e2f9606a0556b3/latest/USD
        //https://v6.exchangerate-api.com/v6/dd9b27baec406a028b5e9953/latest/
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

        //    JsonObject dateUpdates = json.getAsJsonObject("time_last_update_utc");
        //    String dateUpdate = dateUpdates.get(currencyCode).getAsString();
            //JsonObject dateNows = json.getAsJsonObject("time_next_update_utc");

        //    toOutput("data last: "+dateUpdate, "");
            //toOutput("data next: "+dateNow, "");

            double exchangeValue = rates.get(currencyCode).getAsDouble();

            Conversor conversor = new Conversor();
            conversor.toConvert(currency,
                                currencyCode,
                                exchangeValue,
                                value);

            //System.out.println("exchangeValue: "+exchangeValue);
            //System.out.println("rates: "+rates);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
