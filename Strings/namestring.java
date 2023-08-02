import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        System.out.printf("WHAT IS YOUR NAME ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("YOUR NAME IS %s",name);
    }
}
