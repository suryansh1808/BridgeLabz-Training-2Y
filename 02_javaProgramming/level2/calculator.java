import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numer 1 = ");
        float num1= sc.nextFloat();
        System.out.println("enter number 2 = ");
        float num2= sc.nextFloat();
        
        float addition = num1+num2;
        float substraction = num1-num2;
        float multiplication = num1*num2;
        float division = num1/num2;

        System.out.println("the addition,substraction,multiplication,division of two numbers is " + addition +" , " + substraction +" , "+ multiplication + " and " + division );
        
    }
    
}
