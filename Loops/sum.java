import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();

            if (sum + num > 5000) {
                System.out.println("Sum exceeds 5000. Terminating.");
                break;
            }

            sum += num;
        }

        System.out.println("Sum of integers: " + sum);
    }
}
