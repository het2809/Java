import java.util.Scanner;

public class multiply {
    public static int multiply(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int multiplication = multiply(num1, num2);
        System.out.println(multiplication);
    }
}
