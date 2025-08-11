import java.util.*;
public class Calculate_Simple_Interest {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();
        System.out.print("Enter the time in years: ");
        int time = sc.nextInt();
        int interest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }

}
