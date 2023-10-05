import java.util.ArrayList;
import java.util.Scanner;

public class setElement {
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
        System.out.print("Enter Index : ");
        int idx = sc.nextInt();
        System.out.print("Enter Element That You Want To Enter : ");
        int element = sc.nextInt();
        list.set(idx, element);
        System.out.println(list);

    }
}
