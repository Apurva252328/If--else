import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//creating scanner object only main method can access
        System.out.println("Enter a number");
        int year = scanner.nextInt();//local variable for main method
        if((year%400==0) || (year%4==0)&&(year%100!=0))//logic for leap year
        {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
