import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number =sc.nextInt();
        int re = 1;
        for (int i =1; i<=number;i++) {
            re *=i;
        }
        System.out.println("Factorial of " + number + " is: " + re);
    }
}


