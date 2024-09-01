package August_Assignment;

import java.util.Scanner;

public class O50ConvertingKilometersToMiles {
    /*
    Question 50: Converting Kilometers to Miles

    Create a Scanner object to read input from the user.
    Ask the user to enter a distance in kilometers and store it in a double variable named kilometers.
    Convert the distance to miles using the formula: Miles = kilometers * 0.621371.
    Print the distance in miles.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kiloMeter;
        double mile =0;

        System.out.println(" enter the kilometer");
        mile= (kiloMeter = input.nextDouble())*0.621371; // tried to code shorter

        System.out.println(kiloMeter+" is ; "+mile);


    }

}
