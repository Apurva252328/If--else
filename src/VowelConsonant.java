import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating a scanner object access by main method only
        System.out.println("Input an alphabet:");
        char ch = scanner.next().charAt(0);//declare local variable
        if(ch=='a' ||ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
         System.out.println("Input letter is Vowel.");
        }else {
            System.out.println("Expected Output: Input letter is Consonant.");
        }
    }
}
