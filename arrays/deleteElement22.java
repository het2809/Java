import java.util.Scanner;

public class deleteElement22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position : ");
        int loc = sc.nextInt();
        for (int i = loc; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}