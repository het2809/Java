import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String input = string.nextLine();
        String word1 = string.nextLine();
        String word2 = string.nextLine();
        System.out.println(input.replace(word1, word2));
    }
}