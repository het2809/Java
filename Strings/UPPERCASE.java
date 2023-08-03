import java.util.Scanner;
public class UPPERCASE {
    public static void main(String[] args) {
        System.out.print("ENTER YOUR STRING : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String Upper = word.toUpperCase();
        System.out.println(Upper);
    }
}
