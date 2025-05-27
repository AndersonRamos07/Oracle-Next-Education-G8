package challenge.conversor.service;

import java.util.Scanner;

public class Conversor {

    public int choose;
    public double value;

    public double setValue()
    {
        Scanner scanValue = new Scanner(System.in);
        System.out.println("Qual valor quer converter?");
        value = scanValue.nextDouble();
        scanValue.close();
        return value;
    }

    public int toChoose()
    {
        Scanner scan = new Scanner(System.in);
        choose = scan.nextInt();
        scan.close();
        return choose;
    }

    public void toConvert(String currency,
                          String currencyCode,
                          double exchangeValue,
                          double value)
    {
        double resultConverted = exchangeValue * value;
        System.out.println("Taxa de "+currency+" em relação ao "+currencyCode+": " + resultConverted);
    }
}
