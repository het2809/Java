import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String replace = string.replace("h","e");
        System.out.println(replace);
    }
}
