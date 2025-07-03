package challenge.conversor.service;

import challenge.conversor.repository.HandlerFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {

    static double value;
    static double exchangeValue;
    static String currency;
    static String currencyCode;
    static LocalDateTime data;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm'h'");
    static boolean yesOrNo;

    public void conversion(LocalDateTime data,
                           String currency,
                           String currencyCode,
                           double exchangeValue,
                           double value)    {

        this.currency = currency;
        this.currencyCode = currencyCode;
        this.exchangeValue = exchangeValue;
        this.value = value;
        this.data = data;

        double resultConverted = exchangeValue * value;

        try {
            System.out.printf("Taxa de %s em relação ao %s: %.2f", currency, currencyCode, resultConverted);
            System.out.print("\nConversao realizada em: " + data.format(formatter));
            System.out.println("\n");
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            yesOrNo = true;

            HandlerFile.appendLog(this.toString());
        }
    }

    public String toString() {
        return "{" +
                "\ndata:" + data.format(formatter) +
                ",\ncurrency:'" + currency + '\'' +
                ",\nvalue:" + value +
                ",\ncurrencyCode:'" + currencyCode + '\'' +
                ",\nexchangeValue:" + exchangeValue +
                "\n"+'}'+",\n";
    }
}