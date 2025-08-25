import java.util.Scanner; 
public class Feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("distance in feet: ");
        double distanceinfeets = sc.nextDouble();
        double yard = distanceinfeets/3;
        double miles = yard/1760;

        System.out.println(" distance in  feet in yards  is = " + yard );
        System.out.println(" distance in  feet in miles  is = " + miles );

    }
    
}
