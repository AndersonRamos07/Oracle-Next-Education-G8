package deprecated.actions;

public class Conversor {
    String currency;
    String currencyCode;
    double value;

    public Conversor(){};
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(double exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

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
    public void toConvert_custom (String currency,
                                  String currencyCode,
                                  double value)
    {

    }
}
