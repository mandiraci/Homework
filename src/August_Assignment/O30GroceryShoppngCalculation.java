package August_Assignment;

public class O30GroceryShoppngCalculation {
    /*
    Question 30: Grocery Shopping Calculation

    Create int variables named apples and bananas to store the quantities of apples and bananas bought,
     assigning them values like 3 and 6.
    Create double variables named pricePerApple and pricePerBanana and assign them values like 0.50 and 0.30.
    Calculate the total cost for the apples and bananas.
    Print the total cost.
     */
    public static void main(String[] args) {
        int apples ;
        int bananas ;
        apples = 3;
        bananas = 6;
        double pricePerApple ;
        double pricePerBanana ;
        pricePerApple = 0.50;
        pricePerBanana = 0.3;
        double totalCost = (apples*pricePerApple)+(bananas*pricePerBanana);
        System.out.println(totalCost);


    }
}
