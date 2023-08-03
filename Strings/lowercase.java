import java.util.Scanner;
public class lowercase {
    public static void main(String[] args) {
        System.out.printf("Enter Your String ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String lower = word.toLowerCase();
        System.out.println(lower); 
    }
}
