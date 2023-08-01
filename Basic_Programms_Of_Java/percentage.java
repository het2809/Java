import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        System.out.println("Enter Your First Subject Marks");
        float sub1 = marks.nextFloat();
        System.out.println("Enter Your Second Subect Marks");
        float sub2 = marks.nextFloat();
        System.out.println("Enter Your Third Subect Marks");
        float sub3 = marks.nextFloat();
        System.out.println("Enter Your Forth Subect Marks");
        float sub4 = marks.nextFloat();
        System.out.println("Enter Your Fifth Subect Marks");
        float sub5 = marks.nextFloat(); 
        System.out.println("Your Total Marks Are : " + ((sub1+sub2+sub3+sub4+sub5)/5) + "%" );
    }
}
