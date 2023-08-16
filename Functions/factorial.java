import java.util.Scanner;

public class factorial {
    public static void factorials(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorials(n);
    }
}