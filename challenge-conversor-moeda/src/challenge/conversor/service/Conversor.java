package challenge.conversor.service;

import challenge.conversor.repository.HandlerFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.File;

public class Conversor {

    public static double value;
    static String currency;
    static String currencyCode;
    static double exchangeValue;
    static LocalDateTime data;
    static boolean yesOrNo;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm'h'");
    /*
    //public static File arquivo = new File("arquivoDeLogs.txt");

//    public void conversion(String currency,
//                           String currencyCode,
//                           double exchangeValue,
//                           double value,
//                           LocalDateTime data)
//    {
//        this.currency = currency;
//        this.currencyCode = currencyCode;
//        this.exchangeValue = exchangeValue;
//        this.value = value;
//        this.data = data;
//    }
*/
    public void conversion(String currency,
                           String currencyCode,
                           double exchangeValue,
                           double value,
                           LocalDateTime data)    {

        this.currency = currency;
        this.currencyCode = currencyCode;
        this.exchangeValue = exchangeValue;
        this.value = value;
        this.data = data;

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mmh - dd/MM/yyyy");
        //String formattedData = data.format(formatter);

        double resultConverted = exchangeValue * value;

        try {
            System.out.printf("Taxa de %s em relação ao %s: %.2f", currency, currencyCode, resultConverted);
            System.out.print("\nConversao realizada em: " + data.format(formatter));
            System.out.println("\n");
        } catch(Exception e){ e.printStackTrace();
        } finally{
            yesOrNo = true;

            HandlerFile handle = new HandlerFile();
                handle.appendLog(this.toString());
        }
    }

    @Override
    public String toString() {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm'h'");
        return "{" +
                "\ndata:" + data.format(formatter) +
                ",\ncurrency:'" + currency + '\'' +
                ",\nvalue:" + value +
                ",\ncurrencyCode:'" + currencyCode + '\'' +
                ",\nexchangeValue:" + exchangeValue +
                "\n"+'}'+",\n";
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
        *
        * //            String escrito = "\n{" +
//                    "\ndata:" + data +
//                    ",\ncurrency:'" + currency + '\'' +
//                    ",\nvalue:" + value +
//                    ",\ncurrencyCode:'" + currencyCode + '\'' +
//                    ",\nexchangeValue:" + exchangeValue +
//                    "\n"+'}'+",";
    * */
}