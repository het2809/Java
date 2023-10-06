import java.util.Scanner;

public class addElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position : ");
        int loc = sc.nextInt();
        System.out.print("Enter Element : ");
        int element = sc.nextInt();
        for (int i = size; i > loc; i--) {
            arr[i] = arr[i - 1];
        }
        arr[loc] = element;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}