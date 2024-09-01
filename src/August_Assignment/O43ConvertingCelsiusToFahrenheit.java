package August_Assignment;

import java.util.Scanner;

public class O43ConvertingCelsiusToFahrenheit {
    /*
    Question 43: Converting Celsius to Fahrenheit

    Create a Scanner object to read input from the user.
    Ask the user to enter a temperature in Celsius and store it in a double variable named celsius.
    Convert the temperature to Fahrenheit using the formula: Fahrenheit = (celsius * 9/5) + 32.
    Print the temperature in Fahrenheit.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius");
        double celsius = input.nextDouble();

        System.out.println("temperature in Fahrenheit: "+((celsius * 9/5) + 32));



    }
}
