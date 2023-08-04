import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER 1 : ");
        float num1 = sc.nextFloat();
        System.out.print("ENTER NUMBER 2 : ");
        float num2 = sc.nextFloat();
        if (num1 == num2) {
            System.out.println("THEY ARE SAME");
        } else {
            System.out.println("THEY ARE NOT SAME");
        }
    }
}
