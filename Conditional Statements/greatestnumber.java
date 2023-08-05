import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER 1 : ");
        int num1 = sc.nextInt();
        System.out.print("ENTER NUMBER 2 : ");
        int num2 = sc.nextInt();
        System.out.print("ENTER NUMBER 3 : ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num2) {
            System.out.println("THE GREATEST NUMBER IS" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("THE GREATEST NUMBER IS" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("THE GREATEST NUMBER IS : " + num3);
        }
    }
}
