import java.util.ArrayList;
import java.util.Scanner;

public class sortElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        list.sort(null);
        System.out.println(list);
    }
}
