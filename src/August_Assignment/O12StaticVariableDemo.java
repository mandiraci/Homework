package August_Assignment;

public class O12StaticVariableDemo {
    /*
    Question 12: Understanding Static Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named StaticVariableDemo.
    Inside the StaticVariableDemo class, create a main method.

Step 2: Declaring a Static Variable

    Inside the StaticVariableDemo class, declare a static int variable named counter.

Step 3: Incrementing and Printing Static Variable

    Inside the main method, increment the counter variable by 1.
    Print the value of counter using System.out.println.
    Create a new object of StaticVariableDemo and increment the counter variable again.
     Print the value of counter.
     */
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println(counter);
        counter++;
        System.out.println(counter);

        O12StaticVariableDemo obj = new O12StaticVariableDemo();
       obj.counter ++;

        System.out.println(counter);




    }
}
