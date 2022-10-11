import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a age of person :");
        int age = scanner.nextInt();//local variable of main method can access only

        if(age>=18){  //condition for eligible for vote
            System.out.println("Person is eligible to vote");
        }else{
            System.out.println("Person is not eligible to vote");
        }

    }
}
