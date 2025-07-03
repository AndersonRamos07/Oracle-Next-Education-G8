package challenge.conversor.model;

import java.time.LocalDateTime;

public record ConversionRecord(String currency,
                               String currencyCode,
                               double value,
                               double exchangeValue,
                               LocalDateTime data) {
/*    static String currency;
    static String currencyCode;
    static double value;
    static double exchangeValue;
 */
}