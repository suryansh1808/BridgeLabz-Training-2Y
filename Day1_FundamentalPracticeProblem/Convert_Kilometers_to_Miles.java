import java.util.*;
public class Convert_Kilometers_to_Miles {
    public static void main(String []args){
        System.out.print("Enter the distance in kilometers: ");
        Scanner sc = new Scanner (System.in);
        int kilometers = sc.nextInt();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);

    }
}
