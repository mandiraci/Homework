package August_Assignment;

public class O26CalculatingBMI {
    /*
    Question 26: Calculating BMI

    Create a double variable named weight in kilograms and assign it the value 70.0.
    Create a double variable named height in meters and assign it the value 1.75.
    Calculate the BMI using the formula: BMI = weight / (height * height).
    Print the BMI.
     */
    public static void main(String[] args) {
        double kilograms = 70;
        double height = 1.75;
        double BMI = kilograms/ (height*height);
        System.out.println(BMI);
    }
}
