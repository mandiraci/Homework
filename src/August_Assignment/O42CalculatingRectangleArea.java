package August_Assignment;

import java.util.Scanner;

public class O42CalculatingRectangleArea {
    /*
    Question 42: Calculating Rectangle Area

    Create a Scanner object to read input from the user.
    Ask the user to enter the length of a rectangle and store it in a double variable named length.
    Ask the user to enter the width of the rectangle and store it in a double variable named width.
    Calculate the area of the rectangle using the formula: Area = length * width.
    Print the area.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the length of a rectangle ");
        double lenght = input.nextDouble();

        System.out.println("enter the width of the rectangle");
        double width = input.nextDouble();

        double area = lenght * width;
        System.out.println("area of the rectangular is: "+area);




    }
}
