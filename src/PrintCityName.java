import java.util.Scanner;

public class PrintCityName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object main method can access only
        System.out.print("Enter Alphabet :");
        char alphabet = scanner.next().charAt(0);//local variable of main method access only
        switch (alphabet){
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Edalabad");
                break;
            case 'f':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }



    }

}
