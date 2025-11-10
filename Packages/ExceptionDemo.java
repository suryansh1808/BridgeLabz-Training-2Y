// import java.util.Scanner;

// public class ExceptionDemo {

//     static void resultDisplay(int a, int b, int c) 
//     throws ArithmeticException {
//         int result = (a + b + c) / 3;
//         System.out.println("Average = " + result);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         try {

//             System.out.print("Enter first number: ");
//             int num1 = sc.nextInt();

//             System.out.print("Enter second number: ");
//             int num2 = sc.nextInt();

//             System.out.print("Enter third number: ");
//             int num3 = sc.nextInt();

//             resultDisplay(num1, num2, num3);

//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero or invalid arithmetic operation!");
//         } catch (Exception e) {
//             System.out.println("Some other error occurred: " + e.getMessage());
//         } finally {
//             System.out.println("Execution completed 'finally' block executed.");
//         }
//     }
// }



