package deprecated.actions;

import deprecated.basis.DotEnv;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequireAPI {

    public void toRequire(String currency,
                          String currencyCode,
                          double value) {

        HttpClient client = HttpClient.newHttpClient();
        URI link = URI.create(DotEnv.URI_base + currency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double exchangeValue = rates.get(currencyCode).getAsDouble();

            Conversor conversor = new Conversor(currency, currencyCode, value, exchangeValue);
            conversor.toConvert();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
