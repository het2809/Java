import java.util.*;

public class power {

    public static void main(String args[]) {
        System.out.print("Enter x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        System.out.println(x + " to the power " + n + " " + "Is" + " " + ":" + " " + result);
    }
}
