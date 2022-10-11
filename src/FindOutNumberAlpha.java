import java.util.Scanner;

public class FindOutNumberAlpha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object access by main method only
        System.out.println("Enter a any value :");
        char ch = scanner.next().charAt(0);//declare local variable
        if( (ch >='A')&&(ch<='Z')){  //conditions for uppercase alpha
            System.out.println("Entered value ia uppercase alphabet.");
        } else if ((ch>='a')&& (ch<='z')) {  /// conditions for lowercase alpha
            System.out.println("Entered value is lowercase alphabet");
        } else if ((ch >='0')&&(ch<='9')) {  // conditions for numbers
            System.out.println("Entered value is Number.");
        }else {    //conditions for symbol
            System.out.println("Entered value is Symbol");
        }
    }
}
