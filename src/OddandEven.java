import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a number");
        int num = scanner.nextInt();//local variable of scanner object
        String output = num %2==0? "Even" :"Odd";
        System.out.println("Number+" + " : " + num + " is " + output);
    }
}
