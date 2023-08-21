import java.util.Scanner;

public class findArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Your First Array Is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Enter Search Element: ");
        n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Item Found" + " " + count + " " + "Times");
        } else {
            System.out.println("Item not found");
        }
    }
}
