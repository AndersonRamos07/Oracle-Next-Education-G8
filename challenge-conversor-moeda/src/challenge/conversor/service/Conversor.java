package challenge.conversor.service;

import java.util.Scanner;

public class Conversor {

    //public int choose;
    public double value;


    public void toConvert(String currency,
                          String currencyCode,
                          double exchangeValue,
                          double value)
    {
        double resultConverted = exchangeValue * value;
        System.out.println("Taxa de "+currency+" em relação ao "+currencyCode+": " + resultConverted);
    }
}
