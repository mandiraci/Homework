package August_Assignment;

public class O18StaticMethodDemo {
    /*
    Question 18: Understanding Static Methods and Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named StaticMethodDemo.
    Inside the StaticMethodDemo class, create a main method.

Step 2: Declaring a Static Variable and Method

    Inside the StaticMethodDemo class, declare a static int variable named counter.
    Create a static method named incrementCounter that increments counter by 1 and prints its value.

Step 3: Calling Static Method*

    Inside the main method, call incrementCounter twice and observe the value of counter.
     */
    static int counter;
    public static void incrementCounter(){
        counter++;
        System.out.println(counter);
    };

    public static void main(String[] args) {
        System.out.println(counter+" zzz");

      incrementCounter(); // each time method called increment 1
      incrementCounter();
      incrementCounter();
      incrementCounter();
        System.out.println(counter+"ddd");


    }
}
