import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.print("ENTER SIZE OF ARRAY : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("ENTER ELEMENTS IN ARRAY : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IS : " + max);
    }
}
