import java.util.Scanner;

public class numbertype {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER : ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number < 1) {
            System.out.println("NEGATIVE NUMBER");
        } else if (number > 1) {
            System.out.println("POSTIVE NUMBER");
        }
    }
}
