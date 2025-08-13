import java.util.*;
public class ConvertKilometerstoMiles {

    public static void main(String[] args) {
        // km in one mile
        double km_to_mile= 0.621;

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers that you want to convert to miles:");
        double kilometers = sc.nextDouble();
        // Convert kilometers to miles
        double miles = kilometers * km_to_mile;

        System.out.println( miles + " miles in the given kilometers.");
    }
}