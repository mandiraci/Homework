package August_Assignment;

public class O11ShadowingVariables {
    /*
    Question 11: Shadowing Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named ShadowingDemo.
    Inside the ShadowingDemo class, create a main method.

Step 2: Declaring Class-Level and Local Variables with Same Name

    Inside the ShadowingDemo class, declare a String variable named name and initialize it with "Class Level".
    Inside the main method, declare a String variable named name and initialize it with "Local Level".

Step 3: Printing the Value of Shadowed Variable

    Print the value of name inside the main method using System.out.println.
     */
    static String initialize = "Class Level";
    public static void main(String[] args) {
        String initialize = "Local Level";


        System.out.println(initialize);
        System.out.println(O11ShadowingVariables.initialize); //Shadowed


    }
}
