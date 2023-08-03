import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        System.out.printf("ENTER YOUR STRING THAT YOU WANT TO TRIM  ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String trim = string.trim();
        System.out.println(trim);
    }
}
