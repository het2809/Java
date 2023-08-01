import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter an integer:");
        boolean b= S.hasNextInt();
        System.out.println(b);

    }
}
