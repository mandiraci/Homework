package August_Assignment;

public class O32FuelEffecencyCalculation {
    /*
    Question 32: Fuel Efficiency Calculation

    Create a double variable named distance and assign it the value 500.0 representing kilometers traveled.
    Create a double variable named fuelUsed and assign it the value 40.0 representing liters of fuel used.
    Calculate the fuel efficiency in kilometers per liter.
    Print the fuel efficiency.
     */
    public static void main(String[] args) {
        double distance =500.0, fuelUsed = 40.0;
        double efficiency = distance/fuelUsed;
        System.out.println(efficiency);
    }
}
