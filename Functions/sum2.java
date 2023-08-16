import java.util.Scanner;

public class sum2 {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
