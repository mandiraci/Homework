package August_Assignment;

public class O04VariableScoreDemo {
    /*Question 4: Variable Scope in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named VariableScopeDemo.
    Inside the VariableScopeDemo class, create a main method.

Step 2: Declaring Variables with Different Scopes

    Inside the VariableScopeDemo class but outside the main method, declare a String variable named globalVar
     and initialize it with "Global".
    Inside the main method, declare a String variable named localVar and initialize it with "Local".

Step 3: Creating a Method to Demonstrate Scope

    Inside the VariableScopeDemo class, create a method named printVariables that prints the value of globalVar.
    Call printVariables inside the main method.

Step 4: Printing Variables

    Print the value of localVar inside the main method.
    Discuss what happens if you try to print localVar inside the printVariables method.

     */
    String globalVar = "Global";
    public static void main(String[] args) {
        String localVar = "local";
        O04VariableScoreDemo printVariables = new O04VariableScoreDemo();

        System.out.println(localVar);
        System.out.println(printVariables.globalVar);// must be called in method otherwise isnt accesble


    }
}
