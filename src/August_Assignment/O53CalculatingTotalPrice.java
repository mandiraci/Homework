package August_Assignment;

import java.util.Scanner;

public class O53CalculatingTotalPrice {
    /*
    Question 53: Calculating Total Price

    Create a Scanner object to read input from the user.
    Ask the user to enter the quantity of items and the price per item.
    Store these values in int and double variables named quantity and pricePerItem.
    Calculate the total price by multiplying quantity with pricePerItem.
    Print the total price.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        double pricePerItem;

        System.out.println("how many item you have");
        quantity = input.nextInt();
        System.out.println("what's the price");
        pricePerItem = input.nextDouble();

        System.out.println("all cost of your shopping: "+quantity*pricePerItem);


    }
}
