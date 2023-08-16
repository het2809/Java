import java.util.Scanner;

public class calculatesum {
    public static int calculateSum(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = calculateSum(num1, num2);
        System.out.println(total);
    }
}
