import java.util.Scanner;

public class Indexof {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String inputUser = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(inputUser.indexOf(word));
    }
}
