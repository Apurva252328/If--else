import java.util.Scanner;

public class StudentNeedToPass {
    static int total;//global variable access by anybody
    static  double percentage;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//creating scanner object can access by main method only
        System.out.println("Enter a Student name");
        String name = scanner.next();//local variable main method can access only

        System.out.println("Enter a Roll no.");
        int rollno = scanner.nextInt();//local variable

        System.out.println("Enter a 3 subject marks");
        int maths = scanner.nextInt();
        int eng = scanner.nextInt();
        int sci = scanner.nextInt();

        total =maths+eng+sci;
        percentage= total/3;

        System.out.println("Total marks= "+ total + " & " + " Percentage= " + percentage);

       if((maths>=35)&&(eng>=35)&&(sci>=35)){// conditions for pass
           System.out.println("Student is pass");
       }else {
           System.out.println("Student is fail");
       }

    }
}
