import java.util.Scanner;
public class EmployeeSalary {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.print("Enter Employee Id:");
        int id = scanner.nextInt();//declaring local variable with integer datatype

        System.out.print("Enter Employee Name:");
        String name = scanner.next();//declaring local variable with string datatype

        System.out.println("Enter the basic salary");
        double salary = scanner.nextDouble();//declaring salary variable  with double datatype

         double HRA=salary*10/100;//Logic for calculate HRA
         double DA= salary*8/100;//Logic for Calculate DA
         double TA= salary*9/100;//Logic for calculate TA
         double PF= salary*20/100;//Logic for Calculate PF
         double GrossSalary= salary+HRA+DA+TA-PF;
         System.out.println("Gross Salary"+ GrossSalary);

    }
}
