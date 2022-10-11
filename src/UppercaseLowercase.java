import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object can access by main method
        System.out.println("Enter a Alphabet :");
        char ch = scanner.next().charAt(0);//declare local variable
        if((ch>='A')&&(ch<='Z')){//conditions for uppercase
          System.out.println("You entered a uppercase alphabet.");
        }else {
            System.out.println("You entered a lowercase of alphabet.");
        }
    }
}
