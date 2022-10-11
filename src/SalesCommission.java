import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object access by main method only
        System.out.print("Enter Sales ID :");
        int id = scanner.nextInt();//local variable only main method can access

        System.out.print("Enter Seller's Name:");
        String name = scanner.next();//local variable

        System.out.print("Enter the basic salary=");
        int salary = scanner.nextInt();//local variable

        System.out.print("Enter Sales amount=");
        int salesamount = scanner.nextInt();//local variable

         if(salesamount>=50000){
          System.out.println(salesamount*35/100);
        } else if (salesamount>=30000) {
           System.out.println(salesamount*20/100);
         } else if (salesamount>=20000) {
             System.out.println(salesamount*10/100);
         } else if (salesamount>=10000) {
             System.out.println(salesamount*5/100);
         }else {
             System.out.println(salesamount*2/100);
         }

    }
}
