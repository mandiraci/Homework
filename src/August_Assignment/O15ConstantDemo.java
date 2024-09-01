package August_Assignment;

public class O15ConstantDemo {
    /*
    Question 15: Understanding Constants in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named ConstantDemo.
    Inside the ConstantDemo class, create a main method.

Step 2: Declaring Constants

    Inside the main method, declare a constant int variable named MAX_USERS and initialize it with the value 1000.


Step 3: Attempting to Modify Constant Values

    Attempt to modify the value of MAX_USERS and observe the compilation error.

Step 4: Printing Constants

    Print the value of MAX_USERS using System.out.println.
     */
    public static void main(String[] args) {
        final int MAX_USERS =1000;
       // MAX_USERS = 40; // constant value cannot be modified
        System.out.println(MAX_USERS);

    }
}
