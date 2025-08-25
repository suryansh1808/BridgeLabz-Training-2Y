import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perimeter of square ");
        double perimeter = sc.nextDouble();
        
        double side = perimeter/4;
        System.out.println("the length of each side is = " + side);
    }
    
}
