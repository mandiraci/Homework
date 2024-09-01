package August_Assignment;

public class O08FinalVariableDemo {
    /*Question 8: Using Final Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named FinalVariableDemo.
    Inside the FinalVariableDemo class, create a main method.

Step 2: Declaring Final Variables

    Inside the main method, declare a final variable of type int named MAX_VALUE and initialize
     it with the value 100.

Step 3: Attempting to Modify Final Variables

    Try to modify the value of MAX_VALUE and observe the compilation error.

Step 4: Printing Final Variables

    Print the value of MAX_VALUE using System.out.println.

     */
    public static void main(String[] args) {
        int MAX_VALUE = 100;
        System.out.println(MAX_VALUE);

        MAX_VALUE = 200;
        System.out.println(MAX_VALUE);
    }
}
