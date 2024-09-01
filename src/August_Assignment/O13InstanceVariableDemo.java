package August_Assignment;

public class O13InstanceVariableDemo {
    /*
    Question 13: Understanding Instance Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named InstanceVariableDemo.
    Inside the InstanceVariableDemo class, create a main method.

Step 2: Declaring and Initializing Instance Variables

    Inside the InstanceVariableDemo class but outside the main method, declare an int variable named
    instanceCounter and initialize it with 0.

Step 3: Modifying Instance Variables through Objects

    Inside the main method, create two objects of InstanceVariableDemo.
    Increment the instanceCounter variable for each object.
    Print the value of instanceCounter for each object.
     */
    int instanceCounter = 0;
    public static void main(String[] args) {
        O13InstanceVariableDemo obj1 = new O13InstanceVariableDemo();
        obj1.instanceCounter ++;
        O13InstanceVariableDemo obj2 = new O13InstanceVariableDemo();
        obj2.instanceCounter ++;
        System.out.println(obj1.instanceCounter);
        System.out.println(obj2.instanceCounter);


    }
}
