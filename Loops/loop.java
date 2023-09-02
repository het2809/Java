import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int production = 1;
        while (true) {
            int i = sc.nextInt();

            if (i == 0) {
                break;
            }
            production = production * i;
        }
        System.out.println("YOUR PRODUCTION IS : " + production);
    }
}
