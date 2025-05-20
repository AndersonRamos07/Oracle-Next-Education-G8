package actions;

public class Conversor {
    String currency;
    String currencyCode;
    double value;
    double exchangeValue;
    public Conversor(String currency,
                     String currencyCode,
                     double value,
                     double exchangeValue){

        this.currency = currency;
        this.currencyCode = currencyCode;
        this.value = value;
        this.exchangeValue = exchangeValue;
    }
    public void toConvert ()
    {
        double resultConverted = exchangeValue * value;
        System.out.println("Taxa de "+currency+" em relação ao "+currencyCode+": " + resultConverted);
    }
    public void toConvert_custom ()
    {

    }
}
