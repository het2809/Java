import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = sc.nextInt();

        // boolean isValid = (angle1 + angle2 + angle3) == 180;

        // String result = isValid ? "It's a valid triangle." : "It's not a valid
        // triangle.";
        // System.out.println(result);

        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("valid triangle");

        } else {
            System.out.println("Not Valid Triangle");
        }
    }
}
