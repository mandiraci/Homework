package August_Assignment;

public class O29CurrencyConvertion {
    /*
    Question 29: Currency Conversion

    Create a double variable named usdAmount and assign it the value 100.0.
    Create a double variable named conversionRate (e.g., USD to EUR) and assign it the value 0.85.
    Calculate the equivalent amount in EUR by multiplying usdAmount with conversionRate.
    Print the equivalent amount in EUR.
     */
    public static void main(String[] args) {
        double usAmount = 100.0;
        double conversionRate = 0.85;
         double equivalentAmountEUR = usAmount*conversionRate;
        System.out.println(equivalentAmountEUR);

    }
}
