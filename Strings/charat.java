import java.util.Scanner;

public class charat {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int position = sc.nextInt();
        System.out.println(userInput.charAt(position));

    }
    
}
