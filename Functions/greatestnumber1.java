import java.util.Scanner;

public class greatestnumber1 {
    public static void greatestNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " " + "Is Greater");
        } else if (num1 == num2) {
            System.out.println("Both Numbers Are Equal");
        } else {
            System.out.println(num2 + " " + "Is Greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        greatestNumber(num1, num2);
    }
}
