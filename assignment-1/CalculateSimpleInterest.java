import java.util.*;
public class CalculateSimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter principal amount
        int pri = sc.nextInt();
        // enter rate of interest
        int rate = sc.nextInt();
        // enter time in years
        int time = sc.nextInt();
        // calculate simple interest
        double sI = (pri * rate * time) / 100;
        System.out.println("The Simple Interest is  " + sI);
    }
}