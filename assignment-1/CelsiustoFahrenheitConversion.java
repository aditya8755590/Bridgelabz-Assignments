
import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius = sc.nextDouble();
        double f= (celsius * 9/5)+32;
        System.out.println(celsius+ "C is equal to"+ f+ "Farinhite");
    }
}
