import java.util.Scanner;

public class endwith {
    public static void main(String[] args) {
        System.out.printf("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.printf("Enter Word : ");
        String word = sc.nextLine();
        System.out.println(string.endsWith(word));
        
    }
}
