import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.print("Press 1 to continue & 0 to stop : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("Enter your number : ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.print("Press 1 to continue & 0 to stop : ");
            input = sc.nextInt();
        }
        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of zero numbers: " + zero);
    }
}
