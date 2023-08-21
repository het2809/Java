import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Your Reverse Elements are : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
