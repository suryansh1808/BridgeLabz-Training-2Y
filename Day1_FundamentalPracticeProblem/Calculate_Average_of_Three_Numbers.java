import java.util.*;
public class Calculate_Average_of_Three_Numbers {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number 3: ");
        int num3 = sc.nextInt();
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + avg);
    }

}
