import java.util.Scanner;

public class InterchangeValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object only main method can access
        System.out.println("Enter a value of X");
        int x = scanner.nextInt();//local variable of main method can access only

        System.out.println("Enter a value of y");
        int y = scanner.nextInt();//local variable of main method can access only

        int temp = x;
        x = y;
        y = temp;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }
}
