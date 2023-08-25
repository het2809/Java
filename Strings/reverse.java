import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR STRING : ");
        String str = sc.nextLine();
        StringBuilder reverse = new StringBuilder(str);
        for (int i = 0; i < reverse.length() / 2; i++) {
            int front = i;
            int back = reverse.length() - 1 - i;
            char frontchar = reverse.charAt(front);
            char backchar = reverse.charAt(back);
            reverse.setCharAt(front, backchar);
            reverse.setCharAt(back, frontchar);
        }
        System.out.print("YOUR REVERSE STRING IS : ");
        System.out.println(reverse);
    }
}
