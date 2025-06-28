package challenge.conversor.api;

import challenge.conversor.service.Conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

import static challenge.conversor.service.Functions.toOutput;

public class Interacting {

    public void toRequire(String currency, //*USD
                          String currencyCode, //*
                          double value) {

        HttpClient client = HttpClient.newHttpClient();
        URI link = URI.create("https://v6.exchangerate-api.com/v6/2815ad07b3e2f9606a0556b3/latest/" + currency);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            String dateUpdates = json.get("time_last_update_utc").toString();
            String dateNextUpdates = json.get("time_next_update_utc").toString();

            double exchangeValue = rates.get(currencyCode).getAsDouble();
            LocalDateTime data = LocalDateTime.now();

            Conversor conversor = new Conversor();
            conversor.conversion(currency,
                                currencyCode,
                                exchangeValue,
                                value,
                                data);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
    https://v6.exchangerate-api.com/v6/2815ad07b3e2f9606a0556b3/latest/USD
    https://v6.exchangerate-api.com/v6/dd9b27baec406a028b5e9953/latest/

            //String dateUpdate = dateUpdates.get(currencyCode).getAsString();
            //JsonObject dateNows = json.getAsJsonObject();

            //toOutput("data last: "+dateUpdate, "");
            //toOutput("data next: "+dateNow, "");

            //System.out.println("exchangeValue: "+exchangeValue);
            //System.out.println("rates: "+rates);
 */