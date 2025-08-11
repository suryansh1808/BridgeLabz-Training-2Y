import java.util.*;

public class Perimeter_of_a_Rectangle {
    
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    int length = sc.nextInt();
    System.out.print("Enter the width of the rectangle: ");
    int width = sc.nextInt();
    int area = length * width;
    System.out.println("Area of the rectangle: " + area);
}

}
