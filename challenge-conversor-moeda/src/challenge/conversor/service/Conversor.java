package challenge.conversor.service;

public class Conversor {

    public double value;

    public void toConvert(String currency,
                          String currencyCode,
                          double exchangeValue,
                          double value)
    {
        double resultConverted = exchangeValue * value;
        System.out.printf("Taxa de %s em relação ao %s: %.2f",currency, currencyCode, resultConverted);
    }
}