package August_Assignment;

import java.util.Scanner;

public class O44ReadingAndPrintingASentence {
    /*
Question 44: Reading and Printing a Sentence

    Create a Scanner object to read input from the user.
    Ask the user to enter a sentence and store it in a String variable named sentence.
    Print the sentence back to the user.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What sentence i should store?");
        String sentence = input.nextLine();

        System.out.println(sentence);



    }

}