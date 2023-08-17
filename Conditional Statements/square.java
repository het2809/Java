import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length1 = sc.nextInt();
        System.out.println("Enter Width : ");
        int width = sc.nextInt();
        String result = (length1 == width) ? "It Is a square" : "It Is a rectangle";
        System.out.println(result);
    }
}
