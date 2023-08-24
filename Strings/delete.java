import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR STRING : ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("ENTER NUMBER 1 : ");
        int firstnumber = sc.nextInt();
        System.out.print("ENTER NUMBER 2 : ");
        int secondnumber = sc.nextInt();
        sb.delete(firstnumber, secondnumber);
        System.out.println(sb);
    }
}
