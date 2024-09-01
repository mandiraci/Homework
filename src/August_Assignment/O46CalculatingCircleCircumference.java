package August_Assignment;

import java.util.Scanner;

public class O46CalculatingCircleCircumference {
    /*
    Question 46: Calculating Circle Circumference

    Create a Scanner object to read input from the user.
    Ask the user to enter the radius of a circle and store it in a double variable named radius.
    Calculate the circumference using the formula: Circumference = 2 * Math.PI * radius.
    Print the circumference.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println(" enter the radius: ");
        radius = input.nextDouble();

        System.out.println("Circumference ="+(2 * Math.PI * radius));


    }
}
