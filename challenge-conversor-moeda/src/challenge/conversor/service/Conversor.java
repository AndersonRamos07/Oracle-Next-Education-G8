package challenge.conversor.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {

    public double value;

    public void conversion(String currency,
                           String currencyCode,
                           double exchangeValue,
                           double value,
                           LocalDateTime data)    {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedData = data.format(formatter);

        double resultConverted = exchangeValue * value;
        System.out.printf("Taxa de %s em relação ao %s: %.2f",currency, currencyCode, resultConverted);
        System.out.print("\nConversao realizada em: "+formattedData);
        System.out.println("\n");
    }

    /*
    * String coinToConverter;
        String coinConverted;
        double valueToConverter;

        toOutput("Qual moeda a ser convertida? (ex: BRL)", "");
            coinToConverter = pTerminalCustom.nextLine();
        toOutput("Para qual moeda gostaria de converter? (ex: USD)", "");
            coinConverted = pTerminalCustom.nextLine();
        toOutput("Agora insira o valor a ser convertido: (ex: 70.00)", "");
            valueToConverter = pTerminalCustom.nextDouble();
            pTerminalCustom.nextLine();

        Interacting api = new Interacting();
        api.toRequire(coinToConverter,coinConverted,valueToConverter);
    * */
}