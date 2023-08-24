import java.util.Scanner;

public class insertChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR STRING : ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("ENTER POSITION : ");
        int number = sc.nextInt();
        System.out.print("ENTER CHARACTER : ");
        char character = sc.next().charAt(0);
        sb.insert(number, character);
        System.out.println(sb);
    }
}
