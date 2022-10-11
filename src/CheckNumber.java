import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object access by main method only
        System.out.println("Enter a number:");
        int num = scanner.nextInt();//declaring local variable of main method can access only

        if(num>0){       //condition for positive number
            System.out.println("Number is Positive");
        } else if (num<0) {   //condition for negative number
            System.out.println("Number is Negative");

        }else {
            System.out.println("Number is Zero");
        }
    }
}
