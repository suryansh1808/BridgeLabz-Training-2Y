import java.util.*;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter temperature in Celsius: ");
    int a = sc.nextInt();
    double fahrenheit = (a * 9/5) + 32;
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
}
}
