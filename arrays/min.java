import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("ENTER ELEMENTS IN ARRAY : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MINIMUM NUMBER IS : " + min);
    }
}
