import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr1[] = new int[size];
        System.out.println("Enter First Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your First Array Elements Are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Your Second Array Elements Are : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + " ");
        }
    }

}