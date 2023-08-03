import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String substring = name.substring(3 , 8);
        System.out.println(substring);
    }
}
