package August_Assignment;

import java.util.Scanner;

public class O45MultiplyingTwoNumbers {
    /*
    Question 45: Multiplying Two Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter two double values and store them in variables named num1 and num2.
    Calculate the product of the two numbers.
    Print the product.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        System.out.println("total number of the numbers is; "+(num1+num2));

    }
}
