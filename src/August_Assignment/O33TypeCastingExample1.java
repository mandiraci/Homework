package August_Assignment;

public class O33TypeCastingExample1 {
    /*
    Question 33: Type Casting Example 1

    Create a double variable named doubleValue and assign it the value 123.456.
    Perform explicit casting to convert doubleValue to an int variable named intValue.
    Print both doubleValue and intValue.
     */
    public static void main(String[] args) {
        double doubleValue = 123.456;
        int intValue = (int)doubleValue;
        System.out.println(doubleValue);
        System.out.println(intValue);
    }
}
