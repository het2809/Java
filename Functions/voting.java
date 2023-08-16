import java.util.Scanner;

public class voting {
    public static void vote(int age) {
        if (age < 18) {
            System.out.print("You Are Not Eligible For Voting");
        } else {
            System.out.print("You Are Eligible For Voting");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);
    }
}
