package August_Assignment;

import java.util.Scanner;

public class O51CalculatingBMI {
    /*
    Question 51: Calculating BMI

    Create a Scanner object to read input from the user.
    Ask the user to enter their weight in kilograms and height in meters.
    Store these values in double variables named weight and height.
    Calculate the BMI using the formula: BMI = weight / (height * height).
    Print the BMI.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your weight in kilogram");
        double weight = input.nextDouble();
        System.out.println("enter your height in meters");
        double height = input.nextDouble();

        System.out.println("BMI; "+weight / (height * height));


    }
}
