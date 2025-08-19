import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 sq cm

        System.out.println("The area of triangle with base " + base + " inches and height " 
            + height + " inches is " + areaInInches + " square inches and " 
            + areaInCm + " square centimeters");
    }
}
