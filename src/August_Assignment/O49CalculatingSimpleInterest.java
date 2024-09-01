package August_Assignment;

import java.util.Scanner;

public class O49CalculatingSimpleInterest {
    /*
    Question 49: Calculating Simple Interest

    Create a Scanner object to read input from the user.
    Ask the user to enter the principal amount, rate of interest, and time in years. Store these values in double variables named principal, rate, and time.
    Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
    Print the simple interest.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal amount; ");
        double principal = input.nextDouble();
        System.out.println("enter rate");
        double rate = input.nextDouble();
        System.out.println("enter time");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}
