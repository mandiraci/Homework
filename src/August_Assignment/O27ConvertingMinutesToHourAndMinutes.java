package August_Assignment;

public class O27ConvertingMinutesToHourAndMinutes {
    /*
    Question 27: Converting Minutes to Hours and Minutes

    Create an int variable named totalMinutes and assign it the value 135.
    Calculate the number of hours and the remaining minutes.
    Print the result in the format X hours and Y minutes.
     */
    public static void main(String[] args) {
        int totalMinutes = 135;
        int x = totalMinutes/60;
        int y = totalMinutes%60;

        System.out.println("Total minutes of "+totalMinutes+" is: "+ x+ " hours "+y+" minutes");
    }
}
