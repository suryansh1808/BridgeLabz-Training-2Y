package Packages;
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Custom Exception: Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}