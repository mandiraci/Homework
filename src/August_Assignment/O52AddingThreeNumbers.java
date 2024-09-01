package August_Assignment;

import java.util.Scanner;

public class O52AddingThreeNumbers {
    /*
    Question 52: Adding Three Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter three int values and store them in variables named num1, num2, and num3.
    Calculate the sum of the three numbers.
    Print the sum.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println(" enter num1");
        num1 = input.nextInt();
        System.out.println("enter num2");
        num2 = input.nextInt();
        System.out.println("enter num3");
        num3 = input.nextInt();

        System.out.println("sum of the numbers; "+(num1+num2+num3));

    }
}
