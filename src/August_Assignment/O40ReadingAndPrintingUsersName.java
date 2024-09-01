package August_Assignment;

import java.util.Scanner;

public class O40ReadingAndPrintingUsersName {
    /*
    Question 40: Reading and Printing User's Name

    Create a Scanner object to read input from the user.
    Ask the user to enter their first name and store it in a String variable named firstName.
    Ask the user to enter their last name and store it in a String variable named lastName.
    Print a greeting message that includes the user's full name (e.g., "Hello, John Doe!").
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter your first name: ");
        firstName= input.next();

        System.out.println("Enter your last name: ");
        lastName = input.next();

        System.out.println("Hello, "+firstName+" "+lastName+"!");
    }
}
