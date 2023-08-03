import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        System.out.printf("WHAT IS YOUR String ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String trim = name.trim();
        System.out.println(trim);
    }
}
