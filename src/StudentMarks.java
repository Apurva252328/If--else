import java.util.Scanner;

public class StudentMarks {
    static int total;//global variable anyone can access
    static  double percentage;//global variable
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a Student name");
        String name = scanner.next();//local variable access by main method only

        System.out.println("Enter a Roll no.");
        int rollno = scanner.nextInt();//local variable access by main method only

        System.out.println("Enter a 3 subject marks");
        int maths = scanner.nextInt();
        int eng = scanner.nextInt();
        int sci = scanner.nextInt();

        total =maths+eng+sci;
        percentage= total/3;

        System.out.println("Total marks= "+ total + " & " + " Percentage= " + percentage);

        if(percentage>=80){
            System.out.println("Pass with Grade A+");
        } else if (percentage>=60) {
            System.out.println("Pass with grade A");
        } else if (percentage>=50) {
            System.out.println("Pass with grade B");
        } else if (percentage>=35) {
            System.out.println("Pass with grade c");
        }else {
            System.out.println("Fail");
        }

    }
}
