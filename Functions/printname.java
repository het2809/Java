import java.util.Scanner;

public class printname {

    public static void printMyname(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyname(name);
    }
}