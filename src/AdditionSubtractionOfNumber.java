import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class AdditionSubtractionOfNumber {
    public static void main(String[] args){
        int c;
        Scanner scanner = new Scanner(System.in);//creating scanner object access by main method only
        System.out.print("Enter a First Number:");//declaring for first user input
        int a = scanner.nextInt();

        System.out.print("Enter a Second Number:");//declaring for second user input
        int b = scanner.nextInt();
        System.out.println("1.Addition");  // declaring methods of addition,subtraction,multiplication & division
        System.out.println("2. Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your Choice :");

        int num = scanner.nextInt();
        switch (num)
        {
            case 1:
                c = a+ b;//Logic for addition method
                System.out.println("Addition = "+ c);
                break;
            case 2:
                c = a - b;//Logic for subtraction method
                System.out.println("Subtraction = "+ c);
                break;
            case 3:
                c = a * b;//Logic for Multiplication method
                System.out.println("Multiplication = "+ c);
                break;
            case 4:
                c = a/b;//Logic for Division method
                System.out.println("Division = "+ c);
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }
}
