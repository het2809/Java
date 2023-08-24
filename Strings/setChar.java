import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR STRING : ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("ENTER NUMBER OF POSITION : ");
        int number = sc.nextInt();
        System.out.print("ENTER CHARACTER : ");
        char word = sc.next().charAt(0);
        sb.setCharAt(number, word);
        System.out.println(sb);
    }
}
