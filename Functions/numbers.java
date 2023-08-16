import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                zero++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveNumber);
        System.out.println("Count of negative numbers: " + negativeNumber);
        System.out.println("Count of zero numbers: " + zero);
    }
}
