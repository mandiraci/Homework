package August_Assignment;

import java.util.Scanner;

public class O54ReadingAndConcatenatingStrings {
    /*
    Question 54: Reading and Concatenating Strings

    Create a Scanner object to read input from the user.
    Ask the user to enter their first name and store it in a String variable named firstName.
    Ask the user to enter their last name and store it in a String variable named lastName.
    Concatenate the first name and last name with a space in between.
    Print the full name.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name");
        String firstName = input.next();
        System.out.println("What is your last name");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);
    }
}
