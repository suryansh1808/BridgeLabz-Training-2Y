import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

    
        double cm = 0.5 * base * height;
        double inches = cm / (2.54 * 2.54);

        
        System.out.println("The Area of the triangle in sq cm is " + cm+ "The Area of the triangle in sq in is " + inches);
    

        
    }
}
