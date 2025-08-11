import java.util.*;

public class Power_Calculation {

public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.print("Enter the power: ");
    int power = sc.nextInt();
    int result = (int) Math.pow(num, power);
    System.out.println("Result: " + result);
    }
}
