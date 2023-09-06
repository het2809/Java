import java.util.Scanner;

public class summm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            if (sum > 5000) {
                System.out.println("Total Is Larger Than 5000");
                break;
            }
        }
        if (sum < 5000) {
            System.out.println("Sum Is : " + sum);
        }
    }
}
