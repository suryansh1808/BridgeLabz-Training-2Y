import java.util.*;
public class Volume_of_a_Cylinder {
public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of the cylinder: ");
    double radius = sc.nextDouble();
    System.out.println("Enter the height of cylinder:");
    int height = sc.nextInt();
    double volume = Math.PI * (radius * radius) * height;

    System.out.println("Volume of cylinder: " + volume);

    }
}
