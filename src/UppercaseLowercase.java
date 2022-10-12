import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args){
         char a ,b;//declare local variable
        Scanner scanner = new Scanner(System.in);//creating scanner object can access by main method
        System.out.println("Enter a Alphabet :");
        char ch = scanner.next().charAt(0);
        if((ch>='A')&&(ch<='Z')){//conditions for uppercase
            a= Character.toLowerCase(ch);
          System.out.println("You entered a lowercase alphabet= " +a);
        }else {
            b= Character.toUpperCase(ch);
            System.out.println("You entered a uppercase of alphabet= " +b);
        }
    }
}
