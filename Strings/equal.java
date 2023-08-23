import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String string1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String string2 = sc.nextLine();
        System.out.print(string1.equals(string2));
        sc.close();
    }
}
