package actions;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversao {

    public void converter(String currency) {
        HttpClient client = HttpClient.newHttpClient();
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/dd9b27baec406a028b5e9953/latest/" + currency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            //JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();

            // Acessa a chave "rates" e pega o valor específico de, por exemplo, "EUR"
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            // Exemplo: obter a taxa de EUR (Euro)
            double eurRate = rates.get("EUR").getAsDouble();

            System.out.println("Taxa de EUR (Euro) em relação ao USD: " + eurRate);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(response.body());
    }
}
