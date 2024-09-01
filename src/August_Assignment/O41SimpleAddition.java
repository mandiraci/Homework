package August_Assignment;

import java.util.Scanner;

public class O41SimpleAddition {
    /*
    Question 41: Simple Addition

    Create a Scanner object to read input from the user.
    Ask the user to enter two integers and store them in int variables named num1 and num2.
    Calculate the sum of the two numbers.
    Print the sum.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0; // gave zero not to get error
        int num2=0;  // gave zero not to get error


        System.out.println("please enter number 1");
        num1 = input.nextInt();

        System.out.println("please enter number 2");
        num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("your total is: "+sum);



    }
}
