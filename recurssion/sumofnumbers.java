import java.util.Scanner;

public class sumofnumbers {
    public static void sum(int i, int n, int sum) {
        if (i == n) {
            return;
        }
        sum = sum + i;
        System.out.println(sum);
        sum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        sum(i, n, sum);
        System.out.println(sum);
    }

}