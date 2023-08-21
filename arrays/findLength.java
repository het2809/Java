import java.util.Scanner;

public class findLength {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Your Elements Are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("ARRAY LENGTH : " + arr.length);
    }
}
