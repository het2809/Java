import java.util.Scanner;
public class startswith {
    public static void main(String[] args) {
        System.out.println("ENTER STRING : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println("ENTER WORD : ");
        String word = sc.nextLine();
        System.out.println(string.startsWith(word)); 
    }
}
