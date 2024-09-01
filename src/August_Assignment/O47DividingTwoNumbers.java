package August_Assignment;

import java.util.Scanner;

public class O47DividingTwoNumbers {
    /*
    Question 47: Dividing Two Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter two double values and store them in variables named num1 and num2.
    Calculate the result of dividing num1 by num2.
    Print the result.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println(" enter the first number");
        num1 = input.nextDouble();

        System.out.println("Enter second number");
        num2 = input.nextDouble();

        System.out.println("result : "+ (num1/num2));

    }
}
