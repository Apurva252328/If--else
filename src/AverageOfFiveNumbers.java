import java.util.Scanner;

public class AverageOfFiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object access by main method only
        System.out.println("Enter a value of a");//Declaring user input as a,b,c,d&e and only main method can access
        int a = scanner.nextInt();

        System.out.println("Enter a value of b");
        int b = scanner.nextInt();

        System.out.println("Enter a value of c");
        int c = scanner.nextInt();

        System.out.println("Enter a value of d");
        int d = scanner.nextInt();

        System.out.println("Enter a value of e");
        int e = scanner.nextInt();

        int total = a+b+c+d+e;
        int avg = total/2;
        System.out.println("Average of five numbers = " + avg);
    }
}
